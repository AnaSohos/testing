package com.mycompany.stackown;

public class SimpleStack<E> {

    private ForwardLinked<E> linked = new ForwardLinked<E>();

    public void push(E value) {
        linked.addFerst(value);
    }

    public E pop() {

        return linked.deleteFirst();
    }
}
