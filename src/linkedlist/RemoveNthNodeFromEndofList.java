package linkedlist;

public class RemoveNthNodeFromEndofList{
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode res = removeNthFromEnd(head, 1);
        while (res != null){
            System.out.println(res.val);
            res = res.next;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode node = head;
        while(node != null){
            count++;
            node = node.next;
        }
        count = count - n;
        ListNode node2 = head;
        if(count ==0){
            head = head.next;
            return head;
        }
        while(count >1){
            node2 = node2.next;
            count--;
        }

        node2.next = node2.next.next;
        return head;
    }
 }
