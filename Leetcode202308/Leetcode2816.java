package Leetcode202308;

public class Leetcode2816 {
    public ListNode doubleIt(ListNode head) {
        var temp = head.val;
        var pre = dfs(head);
        if(temp >= 5){
            var root = new ListNode(1, pre);
            return root;
        }
        return pre;
    }

    public ListNode dfs(ListNode head){
        if(head == null) return head;

        var temp = head.next == null ? -1 : head.next.val;
        var pre = dfs(head.next);
        var count = 0;
        if(pre != null && temp >= 5){
            count = 1;
        }
        if(head.val*2 + count >= 10){
            head.val = (head.val*2+count) % 10;
            return head;
        }
        head.val = head.val*2 + count;
        return head;
    }
}
