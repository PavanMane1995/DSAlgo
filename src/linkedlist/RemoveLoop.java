package linkedlist;

public class RemoveLoop {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
       // head.next.next.next.next = new ListNode(5);
        head.next.next.next.next = head.next.next;

        removeLoop(head);
        while (head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static void removeLoop(ListNode head){
        // code here
        // remove the loop without losing any nodes

        ListNode slow = head;
        ListNode fast = head;
        ListNode last = fast;
        while(fast != null && fast.next != null){
            last = slow;
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                break;
            }
        }

        if(fast != null){
            slow = head;
            while(slow != fast){
                last = fast;
                slow = slow.next;
                fast = fast.next;

            }
            last.next = null;
        }


    }
}
