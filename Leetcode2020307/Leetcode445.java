package Leetcode2020307;

public class Leetcode445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        var deque1 = new ArrayDeque<Integer>();
        var deque2 = new ArrayDeque<Integer>();
        var cnt = new ArrayDeque<Integer>();

        while(l1!= null){
            deque1.offer(l1.val);
            l1 = l1.next;
        }

        while(l2 != null){
            deque2.offer(l2.val);
            l2 = l2.next;
        }

        var t = 0;
        while(deque1.size() > 0 || deque2.size() > 0 || t > 0){
            int l = 0, r = 0;
            if(deque1.size() > 0) l = deque1.pollLast();
            if(deque2.size() > 0) r = deque2.pollLast(); 
            System.out.println(l+"?"+r+"?"+t);
            if(l + r + t >= 10){
                cnt.offer((l+r+t)%10);
                t = (l+r+t) / 10;
            }
            else {
                cnt.offer(l+r+t);t = 0;}
        }

        var ans = new ListNode(cnt.pollLast());
        var root = ans;
        while(cnt.size() > 0){
            // ans.val = cnt.pollLast();
            ans.next = new ListNode(cnt.pollLast());
            ans = ans.next;
        }
        return root;
    }
}
