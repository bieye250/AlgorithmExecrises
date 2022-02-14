import java.util.*;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

class Test {
    public static void main(String[] args) {

    }

    public int minCostSetTime(int startAt, int moveCost, int pushCost, int targetSeconds) {
        if (targetSeconds <= 99) {
            int a = targetSeconds / 10, b = targetSeconds % 10;
            if (startAt == a || startAt == b)
                return pushCost * 2 + moveCost;
            else
                return (pushCost + moveCost) << 1;
        }
        var deque = new ArrayDeque<Integer>();
        int a = targetSeconds / 60, b = targetSeconds % 60;
        deque.offer(b % 10);
        deque.offer(b / 10);
        deque.offer(a % 10);
        deque.offer(a / 10);
        if (deque.peek() == 0)
            deque.poll();
        if (b > 39) {
            if (deque.contains(startAt))
                return pushCost * deque.size() + moveCost * (deque.size() - 1);
            else
                return (pushCost + moveCost) * deque.size();
        }
        if(a > 10){
            deque.offer(a%10-1);
            deque.offer(b/10+6);
            if(deque.contains(startAt))return pushCost*4+moveCost*3;
            else return (pushCost+moveCost)<<2;
        }
        if (a == 10) {
            deque.poll();
            deque.poll();
            deque.offer(9);
            deque.offer(b/10+6);
        }
        if (deque.contains(startAt)) return pushCost*3+moveCost*2;
        else return (pushCost+moveCost)*3;
    }
}