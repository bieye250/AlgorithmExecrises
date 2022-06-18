public class Leetcode029 {
    public Node insert(Node head, int insertVal) {
        // int cnt = 0;
        // while(cnt++ < 5) {
        //     System.out.println(head.val);head = head.next;}
        Node node = new Node(insertVal);
        if(head == null){
            node.next = node;
            return node;
        }
        if(head.next == head){
            node.next = head;
            head.next = node;
            return head;
        }
        if(head.val < insertVal && head.next.val > insertVal){
            node.next = head.next;
            head.next = node;
            return head;
        }
        if(head.val > head.next.val){
            if(insertVal>=head.val||insertVal<=head.next.val){
                    node.next = head.next;
                    head.next = node;
                    return head;
            }
        }
        Node start = head.next, pre = head;
        int cnt = 0;
        // while(cnt++ < 5) {System.out.println(head.val);head = head.next;}
        while(start!= head){
            if(start.val<=insertVal&&start.next.val>=insertVal){
                System.out.println(start.val);
                node.next = start.next;
                start.next = node;
                return head;
            }
            if(start.val>start.next.val){
                if(insertVal>=start.val||insertVal<=start.next.val){
                    node.next = start.next;
                    start.next = node;
                    return head;
                }
            }
            pre = start;
            start = start.next;
        }
        node.next = head;
        pre.next = node;
        // while(cnt++ < 5) {System.out.println(head.val);head = head.next;}
        return head;
    }
}
