package com.mycompany.imementationowncollection;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class SimpleArrayList<T> implements List<T> {

    private T[] container;

    private int size;

    private int modCount;

    public SimpleArrayList(int capacity) {
        this.container = (T[]) new Object[capacity];
    }

    @Override
    public void add(T value) {
        try {
            if (size < container.length) {
                container[size++] = value;
                modCount++;
            } else {
                container = Arrays.copyOf(this.container, this.container.length * 2);
                container[size++] = value;
                modCount++;
            }

        } catch (IndexOutOfBoundsException e) {

        
        
        } catch (NullPointerException e) {

        }
    }

    @Override
    public T set(int index, T newValue) {

        if (index < 0 || index >= container.length) {
            throw new IndexOutOfBoundsException();
        }
        T oldValue = container[index];
        container[index] = newValue;
        return oldValue;
    }

    @Override
    public T remove(int index) {

        if (index < 0 || index >= container.length) {
            throw new IndexOutOfBoundsException();

        } else {
            T etem = container[index];
            System.arraycopy(container, 0, this.container, 0, index - 1);
            System.arraycopy(container, index + 1, this.container, index, container.length - 1 - index);

            container[container.length - 1] = null;
            size--;
            modCount--;
            

            return etem;
        }

    }

    @Override
    public T get(int index) {

        if (index < 0 || index >= container.length) {
            throw new IndexOutOfBoundsException();
        }
        T elem = container[index];
        return elem;

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int expectedModCount = modCount;
            int sss = 0;

            @Override
            public boolean hasNext() {
               
            if ( sss <= container.length-1  &&  container[sss] ==null){
                     
                  return false;
                 }
               

                return sss < container.length;

            }

            public T next() {
               if (!hasNext()) {
            throw new NoSuchElementException();
        }
                 
                if (expectedModCount != modCount) {
                    throw new ConcurrentModificationException();
                }
                         
                
                if (hasNext()) {
                    return container[sss++];
                } else {
                    throw new NoSuchElementException();
                }

            }

        };
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Arrays.deepHashCode(this.container);
        hash = 53 * hash + this.size;
        hash = 53 * hash + this.modCount;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SimpleArrayList<?> other = (SimpleArrayList<?>) obj;
        return true;
    }

    public T[] getContainer() {
        return container;
    }

    public void setContainer(T[] container) {
        this.container = container;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getModCount() {
        return modCount;
    }

    public void setModCount(int modCount) {
        this.modCount = modCount;
    }

    public SimpleArrayList() {
    }

}
