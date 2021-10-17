package com.mycompany.imementationowncollection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class SimpleSet<T> implements Set<T> {

    private SimpleArrayList<T> set = new SimpleArrayList<>();
    int countNull = 0;
    int size = 0;
    T sravn = null;

    public SimpleSet(int capacity) {
        this.set = new SimpleArrayList<>(capacity);
    }

    @Override
    public boolean add(T value) {
        
        int nulll = 0;
   if (contains(null)) {
            if (nulll ==0){
                set.add(value);
                size++;
                countNull++;
                nulll ++;}
            else{return false;}
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
            
            
            for (T ttt : set) {
                 if(ttt==null){
                     s++;
                     
                 }
              
                  if (ttt.equals(value)) {
                    s++;
                }
               
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
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.set);
        hash = 47 * hash + this.countNull;
        hash = 47 * hash + this.size;
        hash = 47 * hash + Objects.hashCode(this.sravn);
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
        if (this.countNull != other.countNull) {
            return false;
        }
        if (this.size != other.size) {
            return false;
        }
        if (!Objects.equals(this.set, other.set)) {
            return false;
        }
        if (!Objects.equals(this.sravn, other.sravn)) {
            return false;
        }
        return true;
    }

}
