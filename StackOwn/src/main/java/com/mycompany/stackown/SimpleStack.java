package com.mycompany.stackown;

public class SimpleStack<E> {

    private ForwardLinked<E> linked = new ForwardLinked<E>();

    public void push(E value) {
        linked.addFerst(value);
    }
<<<<<<< HEAD
<<<<<<< HEAD
    public void pushLast(E value) {
        linked.add(value);
    }
=======
>>>>>>> 006f593d0eeaad2464d8d3dd0796ef2829b1ea20
=======
=======
    public void pushLast(E value) {
        linked.add(value);
    }
>>>>>>> 63e9b637736414459ac6651f0c2e55561112bb0f
>>>>>>> 2511c4c93ed77d3de9e9f4d73b93c19c18157319

    public E pop() {

        return linked.deleteFirst();
    }
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 2511c4c93ed77d3de9e9f4d73b93c19c18157319
    public E popLast() {

        return linked.deleteLast();
    }
<<<<<<< HEAD
=======
>>>>>>> 006f593d0eeaad2464d8d3dd0796ef2829b1ea20
=======
>>>>>>> 63e9b637736414459ac6651f0c2e55561112bb0f
>>>>>>> 2511c4c93ed77d3de9e9f4d73b93c19c18157319
}
