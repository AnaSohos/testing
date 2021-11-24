package com.mycompany.stackown;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class ForwardLinked<E> implements List<E> {

    public Node<E> start = null;
    int modCount;

    public ForwardLinked() {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
>>>>>>> 01bf464 (tack 1,2 lambda)
       Node<E> newNode = new Node();
=======
        Node<E> newNode = new Node();
>>>>>>> 006f593d0eeaad2464d8d3dd0796ef2829b1ea20
=======
<<<<<<< HEAD
=======
>>>>>>> 59c8a1c796fdcb1736a318f2cee589a502756996
>>>>>>> 01bf464 (tack 1,2 lambda)
        Node<E> newNode = new Node();
=======
       Node<E> newNode = new Node();
>>>>>>> 63e9b637736414459ac6651f0c2e55561112bb0f
<<<<<<< HEAD
>>>>>>> 2511c4c93ed77d3de9e9f4d73b93c19c18157319
=======
<<<<<<< HEAD
=======
>>>>>>> 2511c4c93ed77d3de9e9f4d73b93c19c18157319
>>>>>>> 59c8a1c796fdcb1736a318f2cee589a502756996
>>>>>>> 01bf464 (tack 1,2 lambda)
        modCount = 0;
    }

    @Override
    public void add(E value) {
        Node<E> node = new Node<E>(value, null);
        try {
            if (start == null) {

                start = node;
                modCount++;
                return;

            } else {
                Node<E> ree = start;
                Node<E> ree2 = new Node<E>(value);
                while (ree.next != null) {
                    ree = ree.next;
                }
                ree.next = ree2;
                ree2.next = null;
                modCount++;

            }

        } catch (NullPointerException e) {
        }

    }

    @Override
    public void addFerst(E value) {

        try {
            Node<E> node = new Node<E>(value, null);
            E link;

            node.next = this.start;
            this.start = node;

            modCount++;

            return;

        } catch (NullPointerException e) {
        }
    }

    @Override
    public E get(int index) {
        if (index > checkIndex() - 1 || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        E sss = null;
        int i = -1;
        if (isEnpty()) {
            return null;
        }
        try {
            Node<E> search = start;
            while (search != null) {
                i++;
                if (i == index) {

                    sss = (E) search.value;
                }
                search = search.next;
            }

        } catch (IndexOutOfBoundsException e) {
        }
        return sss;

    }

    public int checkIndex() {
        Node<E> shet;
        int size = 0;
        for (shet = start; shet != null; shet = shet.next) {
            size++;
        }
        return size;
    }

    public E deleteFirst() {
        E val = start.value;
        if (isEnpty()) {
            throw new NoSuchElementException();
        } else {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
            Node<E> one = start;
            Node<E> two = start;
=======
>>>>>>> 2511c4c93ed77d3de9e9f4d73b93c19c18157319
=======
            Node<E> one = start;
            Node<E> two = start;
=======
=======
<<<<<<< HEAD
=======
            Node<E> one = start;
            Node<E> two = start;
=======
>>>>>>> 2511c4c93ed77d3de9e9f4d73b93c19c18157319
>>>>>>> 59c8a1c796fdcb1736a318f2cee589a502756996
>>>>>>> 01bf464 (tack 1,2 lambda)
             Node<E> one = start;
            Node<E> two = start;
            if(two.next == null){
          start = start.next;
            
            }
           
<<<<<<< HEAD
<<<<<<< HEAD
=======
            Node<E> one = start;
            Node<E> two = start;
>>>>>>> 006f593d0eeaad2464d8d3dd0796ef2829b1ea20
=======
>>>>>>> 63e9b637736414459ac6651f0c2e55561112bb0f
>>>>>>> 2511c4c93ed77d3de9e9f4d73b93c19c18157319
=======
>>>>>>> 63e9b637736414459ac6651f0c2e55561112bb0f
=======
<<<<<<< HEAD
=======
            Node<E> one = start;
            Node<E> two = start;
>>>>>>> 006f593d0eeaad2464d8d3dd0796ef2829b1ea20
=======
>>>>>>> 63e9b637736414459ac6651f0c2e55561112bb0f
>>>>>>> 2511c4c93ed77d3de9e9f4d73b93c19c18157319
>>>>>>> 59c8a1c796fdcb1736a318f2cee589a502756996
>>>>>>> 01bf464 (tack 1,2 lambda)

            while (two.next != null) {

                if (two.next.equals(one)) {

                    start = two.next;
                    modCount--;
                    return val;
                }

            }
        }

        return val;

    }

    public E delete(E value) {
        Node<E> del = start, link = null;
        E vas = null;

        if (isEnpty()) {
            throw new NoSuchElementException();
        }
        while (del != null) {
            Node<E> deleteElem = null;

            if (del.value.equals(value)) {
                if (link == null) {
                    vas = start.value;
                    start = start.next;

                } else {
                    vas = del.value;
                    link.next = del.next;

                }

            }
            link = del;
            del = del.next;

        }
        return vas;
    }
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======

=======
=======
<<<<<<< HEAD
>>>>>>> 01bf464 (tack 1,2 lambda)
=======

=======
>>>>>>> 2511c4c93ed77d3de9e9f4d73b93c19c18157319
<<<<<<< HEAD
=======
>>>>>>> 59c8a1c796fdcb1736a318f2cee589a502756996
>>>>>>> 01bf464 (tack 1,2 lambda)
   public E deleteLast() {
        Node<E> del = start, link = null;
        E vas = null;

        if (isEnpty()) {
            throw new NoSuchElementException();
        }
        while (del != null) {
            Node<E> deleteElem = null;

                if (link == null) {
                    vas = start.value;
                    start = start.next;

                } else {
                    vas = del.value;
                    link.next = del.next;

            }
            link = del;
            del = del.next;

        }
        return vas;
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
    public boolean isEnpty() {
        if (checkIndex() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            Node<E> iter = start;
            int modi = modCount;

            @Override
            public boolean hasNext() {
                return iter != null;

            }

            public E next() {

                if (!hasNext()) {
                    throw new NoSuchElementException();
                } else {
                    if (modi != modCount) {
                        throw new ConcurrentModificationException();
                    } else {

                        E val = (E) iter.value;
                        iter = iter.next;
                        return val;
                    }
                }
            }
        };

    }

    static class Node<E> {

        public Node<E> next;
        public E value;

        public Node(E vValue) {
            this.value = vValue;

        }

        public Node(E vValue, Node<E> next) {
            this.value = vValue;
            this.next = next;
        }

        public Node() {

        }

        @Override
        public String toString() {
            return "Node{" + "next=" + next + ", value=" + value + '}';
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 83 * hash + Objects.hashCode(this.next);
            hash = 83 * hash + Objects.hashCode(this.value);
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
            final Node<?> other = (Node<?>) obj;
            return true;
        }

    }

}
