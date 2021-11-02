package com.mycompany.stackown;

public class SimpleStack<E> {

    private ForwardLinked<E> linked = new ForwardLinked<E>();

    public void push(E value) {
        linked.addFerst(value);
    }
<<<<<<< HEAD
    public void pushLast(E value) {
        linked.add(value);
    }
=======
>>>>>>> 006f593d0eeaad2464d8d3dd0796ef2829b1ea20

    public E pop() {

        return linked.deleteFirst();
    }
<<<<<<< HEAD
    public E popLast() {

        return linked.deleteLast();
    }
=======
>>>>>>> 006f593d0eeaad2464d8d3dd0796ef2829b1ea20
}
