/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jashar;

/**
 *
 * @author Jashar
 */
public class Node<E> {

    /**
     * @return the prev
     */
    public Node getPrev() {
        return this.prev;
    }

    /**
     * @param prev the prev to set
     */
    public void setPrev(Node<E> prev) {
        this.prev = prev;
    }

    private E value;
    private Node next;
    private Node prev;

    public Node(E value) {
        this.value = value;
    }

    public Node(E value, Node next) {
        this.value = value;
        this.next = next;
    }

    public Node(E value, Node next, Node prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }

    void setValue(E value) {
        this.value = value;
    }

    public E getValue() {
        return this.value;
    }

    void setNext(Node<E> next) {
        this.next = next;
    }

    public Node<E> getNext() {
        return this.next;
    }

}
