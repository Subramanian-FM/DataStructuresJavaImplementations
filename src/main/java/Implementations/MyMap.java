package Implementations;

import DataStructureInterfaces.Map;

public class MyMap implements Map {

    private class Node{
        private Object key;
        private Object value;
        private Node next;

        public Node(Object key, Object value){
            this.key = key;
            this.value = value;
            next = null;
        }
    }
    private Node first;

    @Override
    public int size() {
        int count = 0;
        if(first!=null)
        {
            Node last = first;
            while (last!=null){
                last = last.next;
                count++;
            }
        }
        return count;
    }

    @Override
    public boolean isEmpty() {
        return first==null;
    }

    @Override
    public boolean containsKey(Object var1) {
        Node last = first;
        while(last!=null){
            if(last.key == var1)
                return true;
            last = last.next;
        }
        return false;
    }

    @Override
    public boolean containsValue(Object var1) {
        Node last = first;
        while(last!=null){
            if(last.value == var1)
                return true;
            last = last.next;
        }
        return false;
    }

    @Override
    public Object get(Object var1) {
        if(first != null && containsKey(var1)){
            Node last = first;
            while (last!=null){
                if(last.key == var1)
                    return last.value;
                last = last.next;
            }
        }
        return null;
    }

    @Override
    public Object put(Object var1, Object var2) {
        Node last = first;
        if(containsKey(var1)){
            while(last!=null){
                if(last.key == var1) {
                    last.value = var2;
                    break;
                }
                last = last.next;
            }
        }
        else{
            Node newNode = new Node(var1,var2);
            if(isEmpty()){
                first = newNode;
            }
            else {
                while(last.next!=null){
                    last = last.next;
                }
                last.next = newNode;
            }
        }
        return var2;
    }

    @Override
    public Object remove(Object var1) {
        Object temp=null;
        if(!isEmpty() && containsKey(var1)){
            if(first.key == var1) {
                temp = first.value;
                first = first.next;
            }
            else {
                Node last = first.next;
                Node prev = first;
                while (last != null) {
                    if(last.key == var1){
                        temp = last.value;
                        prev.next = last.next;
                        break;
                    }
                    last = last.next;
                }
            }
        }
        return temp;
    }

    @Override
    public void clear() {
        first = null;
    }
}
