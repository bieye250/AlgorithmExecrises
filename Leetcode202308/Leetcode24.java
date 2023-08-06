package Leetcode202308;

public class Leetcode24 {
    public ListNode swapPairs(ListNode head) {
        var list = new ArrayList<ListNode>();

        var root = head;
        while(head != null){
            list.add(head);
            head = head.next;
        }

        if(list.size() < 2) return root;

        root = new ListNode(-1);
        head = root;

        for(int i=1; i<list.size();){
            root.next = list.get(i);
            root = root.next;
            System.out.println(root.val);
            root.next = list.get(i-1);
            root = root.next;
            if(i == list.size()-1) {
                root.next = null;
                break;
            }
            else if(i+2 == list.size()){
                root.next = list.get(i+1);
                break;
            }
            i += 2;
        }

        return head.next;
    }
}
