package com.mycompany.linkedlistown;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class SimpleLinkedList<E> implements List<E> {

    private Node<E> start;
    int modCount;

    public SimpleLinkedList() {

        Node<E> newNode = new Node();
        start = null;
        modCount = 0;
    }

    @Override
    public void add(E value) {

        try {
            if (start == null) {
                start = new Node<E>(value);
                modCount++;

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
                search = search.getNext();
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

    public boolean isEnpty() {
        if (checkIndex() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            Node search = start;
            int modi = modCount;

            @Override
            public boolean hasNext() {

                return search != null;

            }

            public E next() {

                if (!hasNext()) {
                    throw new NoSuchElementException();
                } else {
                    if (modi != modCount) {
                        throw new ConcurrentModificationException();
                    } else {

                        E val = (E) search.value;
                        search = search.next;
                        return val;
                    }
                }
            }
        };

    }

    static class Node<E> {

        private Node<E> next;
        private E value;

        public Node(E vValue) {
            this.value = vValue;
            next = null;
        }

        public Node() {

        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public E getValue() {
            return value;
        }

        public void setValue(E value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" + "next=" + next + ", value=" + value + '}';
        }

    }

}
