package linkedlist;

public class ReverseSinglyLinkedListNode {
    public static void main(String[] args) {
        ListNode b = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, null))));
        ListNode c = reverse(b);
        while (c != null){
            System.out.print(c.val+"->");
            c = c.next;
        }
    }

    public static ListNode reverse(ListNode head){
        if(head == null || head.next == null) return head;

        ListNode cur = head;
        ListNode nxt = head.next, prv = null;

        while(cur != null){
            cur.next = prv;
            prv = cur;
            cur=nxt;
            if(nxt !=  null)
                nxt = nxt.next;
        }
        return prv;

    }
}
