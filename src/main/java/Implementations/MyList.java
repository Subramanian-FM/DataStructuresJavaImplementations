package Implementations;

import DataStructureInterfaces.LinkedListFunctions;
import DataStructureInterfaces.List;

public class MyList implements List, LinkedListFunctions {

    // Node class
    private static class Node{
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

    private int indexOf(Object var1){
        Node last = first;
        int count = 0;
        while(last!=null){
            if(last.value == var1)
                return count;
            count++;
            last = last.next;
        }
        return -1;
    }
    // Function which returns the size of the LinkedList
    public int size() {
        int count = 0;
        Node last = first;
        if (last != null) {
            while (last != null){
                last = last.next;
                count++;
            }
        }
        return count;
    }

    // Function which returns true if LinkedList is empty
    public boolean isEmpty() {
        return first==null;
    }

    // Function which returns true if the LinkedList contains var1
    public boolean contains(Object var1) {
        return indexOf(var1) != -1;
    }

    // Function which returns true if var1 is added successfully
    public boolean add(Object var1) {
        Node newNode = new Node(var1);
        if(isEmpty()){
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

    // Function which returns true if var1 is removed successfully
    public boolean remove(Object var1) {
        if(!isEmpty() && contains(var1)){
            if(first.value == var1)
                first = first.next;
            else
                remove(indexOf(var1));
            return true;
        }
        return false;
    }

    // Function to clear the LinkedList
    public void clear() {
        first = null;
    }

    // Function to get the value of the node at index var1
    public Object get(int var1) {
        Node last = first;
        int count = 0;
        if(var1<size() && last!=null && var1>=0){
            while(count<var1){
                last = last.next;
                count++;
            }
            return last.value;
        }
        return null;
    }

    // Function to remove the node at index var1
    public Object remove(int var1) {
        Node last = first;
        Node prev = first;
        Object temp;
        int count = 0;
        if(var1<size() && last!=null && var1>=0){
            while(count<var1 && last.next!=null){
                prev = last;
                last = last.next;
                count++;
            }
            temp = last.value;
            prev.next = last.next;
            return temp;
        }
        return null;
    }

    @Override
    public boolean rotate(int k, int size) {
        if(isEmpty())
            return false;
        Node last = first;
        while (last.next!=null)
            last = last.next;
        last.next = first;
        int count = 0;
        last = first;
        int temp = size - k;
        while (count<(temp- 1)){
            count++;
            last = last.next;
        }
        first = last.next;
        last.next = null;
        return true;
    }

    public void printLinkedList(){
        Node last = first;
        while (last!=null){
            System.out.print(last.value + "->");
            last = last.next;
        }
        System.out.println();
    }
}
