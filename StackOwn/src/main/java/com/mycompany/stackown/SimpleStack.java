package com.mycompany.stackown;

public class SimpleStack<E> {

    private ForwardLinked<E> linked = new ForwardLinked<E>();

    public void push(E value) {
        linked.addFerst(value);
    }
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
    public void pushLast(E value) {
        linked.add(value);
    }
>>>>>>> 63e9b637736414459ac6651f0c2e55561112bb0f
=======
<<<<<<< HEAD
>>>>>>> 01bf464 (tack 1,2 lambda)
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
<<<<<<< HEAD
=======
>>>>>>> 59c8a1c796fdcb1736a318f2cee589a502756996
>>>>>>> 01bf464 (tack 1,2 lambda)

    public E pop() {

        return linked.deleteFirst();
    }
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
>>>>>>> 2511c4c93ed77d3de9e9f4d73b93c19c18157319
=======
=======
<<<<<<< HEAD
=======
=======
>>>>>>> 2511c4c93ed77d3de9e9f4d73b93c19c18157319
>>>>>>> 59c8a1c796fdcb1736a318f2cee589a502756996
>>>>>>> 01bf464 (tack 1,2 lambda)
    public E popLast() {

        return linked.deleteLast();
    }
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 63e9b637736414459ac6651f0c2e55561112bb0f
=======
<<<<<<< HEAD
>>>>>>> 01bf464 (tack 1,2 lambda)
=======
>>>>>>> 006f593d0eeaad2464d8d3dd0796ef2829b1ea20
=======
>>>>>>> 63e9b637736414459ac6651f0c2e55561112bb0f
>>>>>>> 2511c4c93ed77d3de9e9f4d73b93c19c18157319
<<<<<<< HEAD
=======
>>>>>>> 59c8a1c796fdcb1736a318f2cee589a502756996
>>>>>>> 01bf464 (tack 1,2 lambda)
}
