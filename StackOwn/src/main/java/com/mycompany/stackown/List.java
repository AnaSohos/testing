package com.mycompany.stackown;

public interface List<E> extends Iterable<E> {

    E deleteFirst();

    int checkIndex();

    void add(E value);
    
    void addFerst(E value);

    E get(int index);
}
