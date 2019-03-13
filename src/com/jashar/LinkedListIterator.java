/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jashar;

import java.util.Iterator;

/**
 *
 * @author Jashar
 * @param <E>
 */
public class LinkedListIterator<E> implements Iterator {

    private final Node<E> first;
    private Node<E> current;

    public LinkedListIterator(Node first) {
        this.first = first;
        this.current = this.first;
    }

    @Override
    public boolean hasNext() {
        return this.current != null;
    }

    @Override
    public E next() {
        E value = current.getValue();
        current = current.getNext();
        return value;
    }

}
