package linkedlist;

public class MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNode a = new ListNode();
        a.val = 1;
        a.next = new ListNode(2, new ListNode(4, null));
        ListNode b = new ListNode(1, new ListNode(3, new ListNode(4, null)));
        ListNode res = mergeTwoLists2(a,b);
        while (res.next != null){
            System.out.println(res.val);
            res = res.next;
        }
    }

    public static ListNode mergeTwoLists2(ListNode list1, ListNode list2) {

        ListNode merged = new ListNode(0);
        ListNode cur = merged;
        // merged.next = cur;
        while(list1 != null || list2 !=null ){
            if(list1 == null){
                cur.next = new ListNode(list2.val);
            }else if(list2 == null){
                cur.next = new ListNode(list1.val);
            }
            else if(list1.val == list2.val){
                cur.next = new ListNode(list1.val);
                cur.next.next = new ListNode(list2.val);
                list1 = list1.next;
                list2 = list2.next;
                cur = cur.next;
            }else if(list1.val < list2.val){
                cur.next = new ListNode(list1.val);
                list1 = list1.next;
            }else{
                cur.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            cur = cur.next;
        }
        return merged.next;
    }

    public static  ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode merged = new ListNode();
        ListNode cur = new ListNode();
        merged.next = cur;
        while(list1.next != null || list2.next !=null ){
            if(list1.val == list2.val){
                cur.val = list1.val;
                cur.next = new ListNode();
                cur = cur.next;
                cur.val = list2.val;
                cur.next = new ListNode();
                cur = cur.next;
                list1 = list1.next;
                list2 = list2.next;
            }else if(list1.val < list2.val){
                cur.val = list1.val;
                cur.next = new ListNode();
                list1 = list1.next;
            }else{
                cur.val = list2.val;
                cur.next = new ListNode();
                list2 = list2.next;
            }
        }
        return merged.next;
    }
}

 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
