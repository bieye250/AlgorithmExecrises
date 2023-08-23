package Leetcode202308;

public class Leetcode2816 {
    public ListNode doubleIt(ListNode head) {
        var pre = dfs(head);
        return pre > 0 ? new ListNode(1, head) : head;
    }

    public int dfs(ListNode head){
        if(head == null) return 0;

        var count = dfs(head.next);

        var temp = head.val*2+count;
        if(temp >= 10){
            head.val = temp % 10;
            return 1;
        }
        else head.val = temp;
        return 0;
    }
}
