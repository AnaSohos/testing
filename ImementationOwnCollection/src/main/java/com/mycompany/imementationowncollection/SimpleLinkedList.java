package com.mycompany.imementationowncollection;

import java.util.Iterator;

public class SimpleLinkedList<E> implements ListLink<E> {
    
    private Node head = null;
    private Node tail = null;
    int size;

    
     private SimpleLinkedList <E> node = new SimpleLinkedList<>();
    
    public SimpleLinkedList(int capacity) {
        this.node = new SimpleLinkedList<>(capacity);
    }
    
    
    @Override
    public void add(E value) {
        Node <E> newNode = new Node(value);

    if (head == null) {
        head = newNode;
        tail = newNode;
    } else {
        tail.nextNode = newNode;
        tail = newNode;
    }
   
    //tail.nextNode = head;

    node.add((E) newNode);
    size++;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
        
    }

    public SimpleLinkedList() {
    }
    

    private static class Node <E>{

     E value;
    Node nextNode;

    public Node(E value) {
        this.value = value;
    }
    }
}
