package linkedlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReorderList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        reorderList(head); // 1 2 3 4 5

    }

    public static void reorderList(ListNode head) {
        ListNode cur = head;
        ListNode slow = head;
        ListNode fast = head;

        List<ListNode> a = new ArrayList<>();
        Stack<ListNode> b = new Stack<>();
        //find middle
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        boolean f = true;
        while(cur != null){
            if (f) a.add(cur);
            else b.push(cur);

            f = !f;
            cur = cur.next;
        }
        ListNode node = new ListNode();
        ListNode l = node;
        int c =0;
        l.next = a.get(c++);
        l = l.next;
        boolean flag = false;
        while(b.empty()){
            if(flag) l.next = a.get(c++);
            else{
                l.next = b.pop();
            }

            l = l.next;
            flag = !flag;
        }

        head = node.next;

    }
}
