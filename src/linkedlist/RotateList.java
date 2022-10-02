package linkedlist;

public class RotateList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode res = rotateRight(head, 2);
        while (res != null){
            System.out.println(res.val);
            res = res.next;
        }
    }
    public static ListNode rotateRight(ListNode head, int k) {

        ListNode temp = head;
        int size =0;
        while (temp !=null){
            temp = temp.next;
            size++;
        }
        int outerCount =0;
        int mod = k%size;
        while(outerCount < mod){
            int innerCount = 1;
            ListNode cur = head;
            while(innerCount < size-1){
                cur = cur.next;
                innerCount++;
            }
            ListNode list = new ListNode(cur.next.val);
            cur.next = null;
            list.next = head;
            head = list;
            outerCount++;
        }
        return head;

    }
}
