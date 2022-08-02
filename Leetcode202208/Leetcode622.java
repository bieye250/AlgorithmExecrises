package Leetcode202208;

public class Leetcode622 {
    int[] queue;
    int head = 0, tail = 0;
    int len;
    public MyCircularQueue(int k) {
        len = k+1;
        queue = new int[len];
    }
    
    public boolean enQueue(int value) {
        if(isFull()) return false;
        queue[tail%len] = value;
        tail = (tail+1)%len;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()) return false;
        head = (head+1) % len;
        return true;
    }
    
    public int Front() {
        if(isEmpty()) return -1;
        return queue[head%len];
    }
    
    public int Rear() {
        if(isEmpty()) return -1;
        return queue[(tail-1+len)%len];
    }
    
    public boolean isEmpty() {
        if(head == tail) return true;
        return false;
    }
    
    public boolean isFull() {
        if((tail-head+1)%len == 0) return true;
        return false;
    }
}
