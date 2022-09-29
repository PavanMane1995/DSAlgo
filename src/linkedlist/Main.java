package linkedlist;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList s = new SinglyLinkedList();
        s.insertLastWithTail(2);
        s.insertLastWithTail(23);
        //s.print();
        s.insertLastWithTail(14);
        s.insertLastWithTail(8);
        try {
            s.insertAtIndex(1, 5);
        }catch (RuntimeException r){
            System.err.println(r.getMessage());
        }

        s.print();
    }
}
