package com.mycompany.ownmap;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class SimpleMap<K, V> implements Map<K, V> {

    private static final float LOAD_FACTOR = 0.75f;
    private int capacity = 8;
    private int count = 0;
    private int modCount = 0;

    private MapEntry<K, V>[] table = new MapEntry[capacity];

    public SimpleMap() {
        MapEntry<K, V>[] newMap = new MapEntry[capacity];
        count = 0;
    }

    @Override
    public boolean put(K key, V value) {
        if (count >= LOAD_FACTOR * capacity) {
            expand();
            int hash = hash(key.hashCode());
            int index = indexFor(hash);
            table[index] = new MapEntry<K, V>(key, value);
            count++;
            modCount++;

            return true;

        } else {
            int hash = hash(key.hashCode());
            int index = indexFor(hash);

            if (table[index] == null) {
                table[index] = new MapEntry<K, V>(key, value);
                modCount++;
                count++;

                return true;
            }
        }

        return false;
    }
    // вычисление хэша в мапе

    private int hash(int hashCode) {
        int h;
        return (hashCode == 0) ? 0 : (h = hashCode) ^ (h >>> 16);
    }
// вычисление позиции в таблице, на уровне мапы через оператор &

    private int indexFor(int hash) {
        return hash & (table.length - 1);
    }

    private void expand() {
        MapEntry<K, V> one;
        MapEntry<K, V>[] newTable = new MapEntry[capacity * 2];
        int sum = 0;
        while (sum <= table.length - 1) {
            one = table[sum];
            if (one != null) {
                int hash = hash(one.key.hashCode());
                int index = hash & (newTable.length - 1);
                newTable[index] = one;

            }

            sum++;
        }
        table = newTable;

    }

    @Override
    public V get(K key) {

        int hash = hash(key.hashCode());
        int index = indexFor(hash);
    try {
        if (table[index] != null && table[index].key.equals(key)) {
            return table[index].value;
        }
    }catch( IndexOutOfBoundsException e){
        return null;
    
    }
        
    return null;
    }

    @Override

    public boolean remove(K key) {

        int hash = hash(key.hashCode());
        int index = indexFor(hash);

        if (table[index] != null && table[index].key.equals(key)) {
            table[index] = null;
            modCount--;
            
            return true;
        }

        return false;

    }

    @Override
    public Iterator<K> iterator() {

        return new Iterator<K>() {
             int expectedModCount = modCount;
            MapEntry<K, V>[] iter = new MapEntry[table.length];
            MapEntry<K, V> s;

            int of = 0;

            @Override

            public boolean hasNext() {
                if (count == 0) {
                    return false;
                }

                while (of < table.length && table[of] == null) {
                    of++;

                }
                return of < table.length && table[of] != null;

            }

            public K next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                   if (expectedModCount != modCount) {
                    throw new ConcurrentModificationException();
                }
                    

                return (K) table[of++].key;

            }

        };

    }

    private static class MapEntry<K, V> {

        K key;
        V value;
        final int hash;

        public MapEntry(K key, V value) {
            this.key = key;
            this.value = value;
            this.hash = hashCode();

        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        @Override

        public String toString() {
            return "MapEntry{" + "key=" + key + ", value=" + value + '}';

        }
    }

}
