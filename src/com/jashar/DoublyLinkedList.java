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

/*
Your assignment is to implement the Doubly Linked List for generic types.
        Your class needs to have the following methods:
        //    • setFirst – setting the first element of the list
        //    • getFirst – getting the first element of the list
        //    • add – adding the element at the required index
        //    • addToFront – adding the element at the front of the list
        //    • addToRear – adding the element at the rear of the list
        //    • remove – removing the element at the required index
        //    • removeFromFront – removing the element from the front of the list
        //    • removeFromRear – removing the element from the rear of the list
        //    • count – returning the size of the list
            Use the code from the lecture as your reference
 */
public class DoublyLinkedList<E> implements Iterable<E> {

    private Node first;

    /**
     * add element at the index
     *
     * @param element
     * @param index
     */
    void add(E element, int index) {
        if (index == 0) {
            Node temp = this.first;
            Node a = new Node(element);
            a.setNext(temp);
            this.first = a;
        } else if (this.first != null) {
            if (index == 0) {
                Node temp = this.first;
                Node a = new Node(element);
                a.setNext(temp);
                this.first = a;
            } else {
                int count = 0;
                Node current = this.first;
                while (current != null) {
                    if (count + 1 == index) {
                        Node afterIndex = current.getNext();
                        Node newNode = new Node(element);
                        current.setNext(newNode);
                        newNode.setPrev(current);
                        newNode.setNext(afterIndex);
                        if (afterIndex != null) {
                            afterIndex.setPrev(newNode);
                        }
                    }
                    count++;
                    current = current.getNext();
                }

            }

        }
    }

    /**
     * add the element to the end of the list
     *
     * @param element
     */
    void addToRear(E element) {
        if (this.first == null) {
            this.first = new Node(element);
        } else {
            Node current = first;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            Node newNode = new Node(element);
            current.setNext(newNode);
            newNode.setPrev(current);

        }
    }

    /**
     * remove the element at the index
     *
     * @param index
     */
    void remove(int index) {
        if (index == 0 && this.first != null) {
            this.first = this.first.getNext();
        } else {
            int count = 0;
            Node current = this.first;
            while (current != null) {

                if (count + 1 == index) {
                    Node afterIndex = current.getNext().getNext();
                    current.setNext(afterIndex);
                    afterIndex.setPrev(current);
                }
                count++;
                current = current.getNext();
            }
        }
    }

    /**
     * return the number of elements in the list
     *
     * @return
     */
    int count() {
        int count = 0;
        if (this.first == null) {
            return count;
        } else {
            Node current = this.first;
            while (current != null) {
                count++;
                current = current.getNext();
            }
            return count;
        }
    }

    /**
     * returns the first node in the list
     *
     * @return
     */
    Node<E> getFirst() {
        return this.first;
    }

    /**
     * set the first element in the list
     *
     * @param element
     */
    void setFirst(E element) {
        addToFront(element);
    }

    /**
     * set new Node to be first in the list
     *
     * @param element
     */
    void addToFront(E element) {
        if (this.first == null) {
            this.first = new Node(element);
        } else {
            Node firstT = this.first;
            Node newNode = new Node(element);
            this.first = newNode;
            this.first.setNext(firstT);
            firstT.setPrev(newNode);
        }
    }

    /**
     * removes the element from the front of the list
     */
    void removeFromFront() {
        if (this.first != null) {
            Node temp = this.first;
            this.first = temp.getNext();

            temp.setPrev(null);
            temp.setNext(null);
        }
    }

    /**
     * removes the element from the rear of the list
     */
    void removeFromRear() {
        Node current = this.first;

        if (this.first == null) {
            return;
        } else if (this.first.getNext() == null) {
            this.first = null;
            return;
        } else if (this.first.getNext().getNext() == null) {
            this.first.getNext().setNext(null);
            return;
        }

        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }
        current.setNext(null);
    }

    @Override
    public String toString() {
        String list = "";
        for (E el : this) {
            list += el + ",";
        }
        return list;
    }

    @Override
    public Iterator<E> iterator() {
        return new LinkedListIterator<>(this.first);
    }

}
