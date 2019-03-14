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
public class Main {

    public static void main(String[] args) {
        new Main().linkedListMain();

    }

    void linkedListMain() {
        LinkedList<Integer> a = new LinkedList();

        a.addToRear(0);
        a.addToRear(1);
        a.addToRear(3);
        a.addToRear(5);
        a.addToRear(6);
        a.remove(2);
        a.addToRear(45);
        a.addToRear(67);
        a.add(123456, 1);
        a.add(142, 1);
        a.addToFront(7);
        a.addToFront(16);
        System.out.println(a);

        LinkedList<String> b = new LinkedList();
        b.addToRear("sdas");
        b.addToRear("sdsd");
        System.out.println(b);

        LinkedList<Integer> c = new LinkedList();
        c.addToFront(1);
        c.add(15, 1);
        c.removeFromFront();
        c.removeFromRear();
        c.add(75, 0);
        c.addToFront(12);
        System.out.println(c);

        DoublyLinkedList<Integer> d = new DoublyLinkedList();
        d.addToFront(12);
        d.addToFront(14);
        d.addToFront(15);
        d.addToFront(118);
        d.addToFront(78);
        d.removeFromFront();
        d.removeFromFront();
        d.removeFromRear();
        d.removeFromRear();
        d.addToFront(23);
        d.setFirst(45);

        System.out.println(d.count());
        System.out.println(d);
        d.remove(1);
        System.out.println(d.count());
        System.out.println(d);

        DoublyLinkedList<Integer> e = new DoublyLinkedList<>();
        e.addToFront(15);
        System.out.println(e);
        e.remove(0);
        e.addToRear(2);
        e.addToRear(5);
        System.out.println("Tst" + e);
        System.out.println(e.getFirst().getValue());
        System.out.println(e.getFirst().getNext().getValue());
        System.out.println(e.getFirst().getNext().getPrev().getValue());
        e.add(12, 1);
        System.out.println(e);
        e.add(18, 1);
        e.add(78, 6);
        e.add(45, 4);
        e.add(45, 5);
        e.removeFromRear();
        e.removeFromRear();
        System.out.println(e);
    }
}
