package Leetcode202208;

public class Leetcode641 {
    class MyCircularDeque {
        class Node{
            Node next;
            Node previous;
            int val;
            public Node(int val, Node next, Node previous){
                this.val = val;
                this.next = next;
                this.previous = previous;
            }
            public Node(int val){
                this.val = val;
            }
        }
        Node first;
        Node rear;
        int len;
        int size;
        public MyCircularDeque(int k) {
            len = k;
            size = 0;
            first = null;
            rear = null;
        }
        
        public boolean insertFront(int value) {
            if(isFull()) return false;
            else if(isEmpty()){
                var node = new Node(value);
                first = node;
                rear = node; 
            }
            else {
                var node = new Node(value,first,null);
                first.previous = node;
                first = node;
            }
            size++;
            return true;
        }
        
        public boolean insertLast(int value) {
            if(isFull()) return false;
            else if(isEmpty()){
                var node = new Node(value);
                first = node;
                rear = node;
            }
            else {
                var node = new Node(value,null,rear);
                rear.next = node;
                rear = node;
            }
            size++;
            return true;
        }
        
        public boolean deleteFront() {
            if(isEmpty()) return false;
            var node = first.next;
            first = null;
            first = node;
            if(first != null) first.previous = null;
            else rear = null;
            size--;
            return true;
        }
        
        public boolean deleteLast() {
            if(isEmpty()) return false;
            var node = rear.previous;
            rear = null;
            rear = node;
            if(rear != null) rear.next = null;
            else first = null;
            size--;
            return true;
        }
        
        public int getFront() {
            if(isEmpty()) return -1;
            return first.val;
        }
        
        public int getRear() {
            if(isEmpty()) return -1;
            return rear.val;
        }
        
        public boolean isEmpty() {
            if(first == null && rear == null) return true;
            return false;
        }
        
        public boolean isFull() {
            if(size == len) return true;
            return false;
        }
    }
}
