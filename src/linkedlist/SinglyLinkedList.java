package linkedlist;


class Node{
    int val;
    Node next;

    public Node(int val, Node next){
        this.val  = val;
        this.next = next;
    }
    public Node(int val){
        this.val = val;
    }
}
public class SinglyLinkedList {
    Node head;
    Node tail;
    int size;

    //Without tail.
    public void insertLast(int val){

        Node node = new Node(val);
        size+=1;
        if(head == null){
            head = node;
            return;
        }
        Node cur = head;
        while(cur.next !=null){
            cur = cur.next;
        }
        cur.next = node;
    }
    public void insertFirst(int val){
        Node n = new Node(val);
        n.next = head;
        head = n;

        if(tail == null ){
            tail = head;
        }
        size+=1;

    }

    //With tail
    public void insertLastWithTail(int val){
        Node node = new Node(val);
        size+=1;
        if(head == null){
            head = node;
            tail = head;
            return;
        }
        tail.next = node;
        tail = node;


    }

    //insert at given index
    public void insertAtIndex(int val, int index){
        Node node = new Node(val);
        if(head == null){
            insertFirst(val);
            return;
        }else if(size < index){
            throw new RuntimeException("index cannot br greater than linked list size");
        }
        Node cur = head;
        int count =0;
        while (count < index-1){
            cur = cur.next;
            count++;
        }
        node.next = cur.next;
        cur.next= node;
    }

    public void print(){
        Node temp = head;
        System.out.println("Size of Linked List is "+size);
        while (temp != null){
            System.out.print(temp.val + "-> ");
            temp = temp.next;
        }
        System.out.print("END");

    }
}

