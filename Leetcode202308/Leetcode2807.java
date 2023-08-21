package Leetcode202308;

public class Leetcode2807 {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        var root = head;

        while(head.next != null){
            var t = new ListNode(max(head.val, head.next.val));
            t.next = head.next;
            head.next = t;
            head = head.next.next;
        }
        return root;
    }

    public int max(int a, int b){
        if(b == 0) return a;

        return max(b, a%b);
    }
}
