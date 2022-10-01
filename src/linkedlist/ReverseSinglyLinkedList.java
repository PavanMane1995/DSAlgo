package linkedlist;

public class ReverseSinglyLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        //head.next.next.next.next = new ListNode(5);
        ListNode res = reverse(head);
        while (res != null){
            System.out.println(res.val);
            res = res.next;
        }
    }

    public static ListNode reverse(ListNode head){
        ListNode node1 = head; int i=0,j=0;
        while (node1.next !=null){
            node1 = node1.next;
            j++;
        }
        ListNode leftNode = head;
        while(i < j){
            int k=0;
            ListNode rightNode = head;
            while(k < j){
                rightNode = rightNode.next;
                k++;
            }
            int temp = leftNode.val;
            leftNode.val = rightNode.val;
            rightNode.val = temp;
            leftNode = leftNode.next;
            rightNode = head;
            i++;
            j--;
        }
        return head;
    }
}
