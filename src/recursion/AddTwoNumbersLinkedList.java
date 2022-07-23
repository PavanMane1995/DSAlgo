/*
package recursion;

import lombok.val;

public class AddTwoNumbersLinkedList {

    public static void main(String[] args) {
        ListNode a = new ListNode(9);
        ListNode b = new ListNode(1);
        b.next = new ListNode(9);
        b.next.next = new ListNode(9);
        b.next.next.next = new ListNode(9);
        b.next.next.next.next = new ListNode(9);
        b.next.next.next.next.next = new ListNode(9);
        b.next.next.next.next.next.next = new ListNode(9);
        b.next.next.next.next.next.next.next = new ListNode(9);
        b.next.next.next.next.next.next.next.next = new ListNode(9);



       int aSum = add1(b);
        int bSum = add1(a);
        System.out.println(aSum+bSum);

        //342 + 053= 395
        ListNode c = new ListNode();
       // System.out.println(addTwoNumbers(a, b));

        ListNode cc = convertToLinkedNode(aSum+bSum, null);
        //ListNode ll =reverse(convertToLinkedNode(aSum+bSum, null));
        ListNode curr =cc;
        while (curr.next != null){
            System.out.println(curr.getValue());
            curr = curr.next;
        }
        System.out.println(curr.value);
    }

    public static int add1(ListNode l1) {
        if(l1.next == null){
            return l1.value;
        }

        return add1(l1.next)*10+l1.value;

    }

    public static int addTwoNumbers(ListNode l1, ListNode l2) {

        if(l1.next == null){
            //System.out.println(l1.value);
            return l1.value;
        }if(l2.next == null){
            return l2.value;
        }
         return (addTwoNumbers(l1.next, l2)*10+l1.value) + (addTwoNumbers(l1, l2.next)*10+l2.value);

    }

    public static ListNode convertToLinkedNode(int n, ListNode l1){

        if(n ==0){
            return l1;
        }
        ListNode l = new ListNode();
            l.value = n%10;
            l.next = l1;

         return convertToLinkedNode (n/10, l);

    }
    public static ListNode reverse(ListNode head){
        if (head == null) {
            return null;
        }
        if (head.next== null) {
            return head;
        }
        ListNode node = reverse(head.next);
        head.next.next =head;
        head.next = null;
        return node;
    }
}

class ListNode1 {
     int value;
     ListNode next;
    public ListNode(int value){
        this.value = value;
        this.next = null;
    }
     ListNode(){
         this.next = null;
    }
    ListNode(int val, ListNode next) { this.value = val; this.next = next; }
    public int getValue(){
        return value;
    }


}
*/
