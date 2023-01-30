package Leetcode202301;

public class Leetcode1669 {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        var root = list1;
        var cnt = 0;
        while(cnt < a-1){
            list1 = list1.next;
            cnt++;
        }
        var node = list1.next;
        while(list2 != null){
            list1.next = list2;
            list1 = list1.next;
            list2 = list2.next;
        }
        while(cnt++ < b){
            node = node.next;
        }
        list1.next = node;
        return root;
    }
}
