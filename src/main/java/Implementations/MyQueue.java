package Implementations;

import DataStructureInterfaces.Queue;

import java.util.NoSuchElementException;

public class MyQueue implements Queue {

    // Node class
    private class Node{
        private Object value;   // Value to hold the element
        private Node next;      // next to hold the address of the next node

        // Constructor to initialize the Node(Object element=>value)
        Node(Object element){
            value = element;
            next = null;
        }
    }
    // A node to denote the starting point of the LinkedList
    private Node first;

    // offer() returns true if var1 is successfully inserted into the queue
    @Override
    public boolean offer(Object var1) {
        Node newNode = new Node(var1);
        if(newNode.value!=null){
        if(first == null){
            first = newNode;
        }
        else {
            Node last = first;
            while(last.next!=null){
                last = last.next;
            }
            last.next = newNode;
        }
        return true;
        }
    return false;
    }

    // remove function returns and deletes the first element of the queue else throws an exception
    @Override
    public Object remove() {
        if(first!=null){
            Object temp = first.value;
            first = first.next;
            return temp;
        }
        throw new NoSuchElementException();
    }

    // poll function returns and deletes the first element of the queue. If queue empty -> returns null
    @Override
    public Object poll() {
        if(first!=null){
            Object temp = first.value;
            first = first.next;
            return temp;
        }
        return null;
    }

    // element function returns the first element of the queue else throws an exception
    @Override
    public Object element() {
        if(first!=null){
            return first.value;
        }
        throw new NoSuchElementException();
    }

    // peek function returns the first element of the queue. If queue is empty -> returns null
    @Override
    public Object peek() {
        if(first!=null){
            return first.value;
        }
        return null;
    }
}
