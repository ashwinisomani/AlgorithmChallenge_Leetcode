package LinkedList;

public class ReorderList {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);
        node.next.next.next.next.next= new ListNode(6);

        ListNode result = ReorderList.reorderList(node);
        System.out.println(result);
    }

    public static ListNode reorderList(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast!= null && fast.next != null)  {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode curr = reverse(slow);
        ListNode first = head;
        ListNode second = curr;

        while(second.next != null){
            ListNode temp = first.next;
            first.next = second ;
            first = temp;

            temp = second.next;
            second.next = first;
            second = temp;
        }
        return head;
    }
    public static ListNode reverse(ListNode head){
        ListNode prev = null;
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

