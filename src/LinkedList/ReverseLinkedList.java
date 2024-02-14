package LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
     ListNode node = new ListNode(1);
     node.next = new ListNode(2);
     node.next.next = new ListNode(3);
     node.next.next.next = new ListNode(4);

     ListNode result = ReverseLinkedList.reverseList(node);
     System.out.println(result);


    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null ;
        ListNode curr = head;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev ;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}


