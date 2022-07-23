package recursion;

   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
class Solution {
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
        ListNode cc =addTwoNumbers1(a,b);

        ListNode curr =cc;
        while (curr.next != null){
            System.out.println(curr.val);
            curr = curr.next;
        }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int a = add1(l1);
        int b = add1(l2);

        int sum = a+b;
        if(sum == 0){
            return new ListNode();
        }
        return reverse(convertToLinkedNode(sum, null));

    }
    public static int add1(ListNode l1) {
        if(l1.next == null){
            return l1.val;
        }

        return add1(l1.next)*10+l1.val;

    }
    public static ListNode convertToLinkedNode(int n, ListNode l1){

        if(n ==0){
            return l1;
        }
        ListNode l = new ListNode();
        l.val = n%10;
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

    public static ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        return dummyHead.next;
    }
}