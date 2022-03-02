public class Leetcode2181 {
    public static void main(String[] args) {

    }

    public ListNode mergeNodes(ListNode head) {
        ListNode pre = head.next;
        ListNode root = pre;
        int sum = 0;
        boolean flag = false;
        while(head.next != null){
            head = head.next;
            if(head.val != 0){
                sum += head.val;
                if(flag){
                    pre = pre.next;
                    flag = false;
                }
            }
            else{
                pre.val = sum;
                sum = 0;
                flag = true;
            }
        }
        pre.next = null;
        return root;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}