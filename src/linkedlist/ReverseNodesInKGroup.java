package linkedlist;

public class ReverseNodesInKGroup {

    public static void main(String[] args) {
        ListNode c = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, null))));

        ListNode e = reverseKNodes(c,2);
        while (e != null){
            System.out.print(e.val+"->");
            e = e.next;
        }


    }

    public static ListNode reverseKNodes(ListNode head, int k){

        if(head == null || head.next == null || k==1)return head;
        ListNode st = head;
        ListNode end = head;
        int inc = k-1;
        while (inc >0){
            inc--;
            end = end.next;
            if(end == null) return head;

        }
        ListNode nextNode = reverseKNodes(end.next,k);
        reverse(st, end);

        st.next = nextNode;
        return end;
    }

    public static void reverse(ListNode st, ListNode end){

        ListNode cur = st;
        ListNode nxt = st.next;
        ListNode prv = null;

        while(prv != end){
            cur.next = prv;
            prv = cur;
            cur = nxt;
            if(nxt != null)
                nxt = nxt.next;
        }
    }

}
