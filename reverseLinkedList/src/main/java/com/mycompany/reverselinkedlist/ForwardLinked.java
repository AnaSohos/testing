package com.mycompany.reverselinkedlist;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class ForwardLinked<T> implements Iterable<T> {

    private Node<T> head;
    private int size;

    public void add(T value) {
        Node<T> node = new Node<T>(value, null);
        if (head == null) {
            head = node;
            return;
        }
        Node<T> tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = node;
        size++;
    }

    public boolean revert() {
        boolean bool = false;
        if (head == null) {
            bool = false;
            return bool;
        }

        Node<T> one = head;
        while (one.next != null) {
            one = one.next;
        }

        one.next = head;

        Node<T> two = head.next;
        head.next = null;
        while (two.next != null) {
            Node<T> tree = two.next;
            two.next = head;
            head = two;
            two = tree;
            bool = true;
        }

        return bool;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.head);
        hash = 13 * hash + this.size;
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
        final ForwardLinked<?> other = (ForwardLinked<?>) obj;
        return true;
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Node<T> node = head;

            @Override
            public boolean hasNext() {
                return node != null;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T value = node.value;

                node = node.next;
                return value;
            }
        };
    }

    private static class Node<T> {

        T value;
        Node<T> next;
        Node<T> end;

        public Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }
    }
}
