package com.mycompany.imementationowncollection;

import static java.util.Objects.isNull;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class SimpleSet<T> implements Set<T> {

    private SimpleArrayList<T> set = new SimpleArrayList<>();

    int size = 0;
    int nulll = 0;

    public SimpleSet(int capacity) {
        this.set = new SimpleArrayList<>(capacity);
    }

    @Override
    public boolean add(T value) {

        if (IsNull(value) && nulll == 0) {

            set.add(value);
            size++;
            nulll++;
            return true;
        }

        try {
            if (!contains(value)) {

                set.add(value);
                size++;
                return true;

            }
        } catch (ArrayIndexOutOfBoundsException e) {
            set = new SimpleArrayList<>(this.set.getSize() * 2);
            for (T ttt : this.set) {
                set.add(ttt);
            }

            set.add(value);
            size++;
            return true;
        }

        return false;

    }

    @Override
    public boolean contains(T value) {
        int s = 0;

        try {

            if (!IsNull(value)) {

                for (T ttt : set) {

                    if (ttt.equals(value)) {
                        s++;
                    }
                  

                }
            } else if (IsNull(value)) {
                s++;
            } else {
                s = 0;
            }

        } catch (NullPointerException e) {
             
        }

        return s == 1;
    }

    @Override
    public Iterator<T> iterator() {
        return set.iterator();
    }

    public SimpleArrayList<T> getSet() {
        return set;
    }

    public void setSet(SimpleArrayList<T> set) {
        this.set = set;
    }

    @Override
    public String toString() {
        return "SimpleSet{" + "set=" + set + '}';
    }

    public SimpleSet() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.set);
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
        final SimpleSet<?> other = (SimpleSet<?>) obj;
        if (!Objects.equals(this.set, other.set)) {
            return false;
        }
        return true;
    }

    private boolean IsNull(T value) {
        return value == null;
    }

}
