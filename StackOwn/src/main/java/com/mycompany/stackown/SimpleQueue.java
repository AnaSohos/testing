package com.mycompany.stackown;

import java.util.NoSuchElementException;
import java.util.Objects;

public class SimpleQueue<T> {

    private final SimpleStack<T> in = new SimpleStack<>();
    private final SimpleStack<T> out = new SimpleStack<>();
    int size;

    public SimpleQueue() {
        SimpleStack<T> in = new SimpleStack<>();
        SimpleStack<T> out = new SimpleStack<>();
        size=0;

    }

    public T poll() {
    if(size <=0){
        throw new NoSuchElementException(); }
         T item = null;
       
        try {
           
              item = out.pop();
          
        } catch (NullPointerException e) {
      } 
        catch (NoSuchElementException e) { 
        }
        
        return item;
    }

    public void push(T value) {

        try {
            in.push(value);

           out.pushLast(in.pop());
           size++;
        } catch (NoSuchElementException e) {
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.in);
        hash = 29 * hash + Objects.hashCode(this.out);
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
        final SimpleQueue<?> other = (SimpleQueue<?>) obj;
        return true;
    }

}
