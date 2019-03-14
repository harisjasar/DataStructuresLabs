/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jashar;

import java.util.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Jashar
 */
public class LinkedListTest {

    public LinkedListTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of removeFromRear method, of class LinkedList.
     */
    @Test
    public void testRemoveFromRear() {
        System.out.println("removeFromRear");
        LinkedList instance = new LinkedList();
        instance.removeFromRear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFromFront method, of class LinkedList.
     */
    @Test
    public void testRemoveFromFront() {
        System.out.println("removeFromFront");
        LinkedList instance = new LinkedList();
        instance.removeFromFront();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirst method, of class LinkedList.
     */
    @Test
    public void testGetFirst() {
        System.out.println("getFirst");
        LinkedList instance = new LinkedList();
        Node expResult = null;
        Node result = instance.getFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFirst method, of class LinkedList.
     */
    @Test
    public void testSetFirst() {
        System.out.println("setFirst");
        Object element = null;
        LinkedList instance = new LinkedList();
        instance.setFirst(element);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addToFront method, of class LinkedList.
     */
    @Test
    public void testAddToFront() {
        System.out.println("addToFront");
        Object element = null;
        LinkedList instance = new LinkedList();
        instance.addToFront(element);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addToRear method, of class LinkedList.
     */
    @Test
    public void testAddToRear() {
        System.out.println("addToRear");
        Object element = null;
        LinkedList instance = new LinkedList();
        instance.addToRear(element);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class LinkedList.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        LinkedList<Integer> instance = new LinkedList();
        instance.add(1, 0);
        instance.add(2, 0);
        assertEquals(2, instance.count());
    }

    /**
     * Test of remove method, of class LinkedList.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        int index = 0;
        LinkedList<String> instance = new LinkedList();
        instance.add("i", 0);
        instance.add("j", 0);
        instance.remove(1);
        assertEquals(1, instance.count());
    }

    /**
     * Test of count method, of class LinkedList.
     */
    @Test
    public void testCount() {
        System.out.println("count");
        LinkedList<Integer> instance = new LinkedList();
        instance.add(13, 0);
        int expResult = 1;
        int result = instance.count();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class LinkedList.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        LinkedList instance = new LinkedList();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class LinkedList.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        LinkedList instance = new LinkedList();
        Iterator expResult = null;
        Iterator result = instance.iterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
