package com.mycompany.stackown;

public class SimpleStack<E> {

    private ForwardLinked<E> linked = new ForwardLinked<E>();

    public void push(E value) {
        linked.addFerst(value);
    }
<<<<<<< HEAD
=======
    public void pushLast(E value) {
        linked.add(value);
    }
>>>>>>> 63e9b637736414459ac6651f0c2e55561112bb0f

    public E pop() {

        return linked.deleteFirst();
    }
<<<<<<< HEAD
=======
    public E popLast() {

        return linked.deleteLast();
    }
>>>>>>> 63e9b637736414459ac6651f0c2e55561112bb0f
}
