package stack;

//https://leetcode.com/problems/min-stack/
public class MinStackMain {
    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(-1);
        stack.push(2);
        stack.push(-3);
        stack.pop();
        stack.push(3);

        System.out.println(stack.getMin());
        System.out.println(stack.top());
    }
}

 class MinStack {
    Node head ;
    public MinStack() {

    }

    public void push(int val) {

        if(head == null){
            head = new Node(val, val, null);
        }else {
            head = new Node(val, Integer.min(val, head.min), head);
        }
    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.min;
    }
}

class Node {
    int val;
    int min;
    Node next;

    public Node(int val, int min, Node next) {
        this.val = val;
        this.min = min;
        this.next = next;
    }
}
