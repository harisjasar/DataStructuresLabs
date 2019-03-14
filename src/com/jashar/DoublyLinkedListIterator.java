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
public class DoublyLinkedListIterator<E> implements Iterator {

    private final Node first;
    private final Node current;

    public DoublyLinkedListIterator(Node first) {
        this.first = first;
        this.current = this.first;
    }

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Node next() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /*
    public boolean hasPrevious(){

    }

    public Node prev(){

    }
     */
}
