
package com.mycompany.imementationowncollection;


public interface Set<T> extends Iterable<T> {
    boolean add(T value);
    boolean contains(T value);
}
