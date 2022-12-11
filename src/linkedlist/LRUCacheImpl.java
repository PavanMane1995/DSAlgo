package linkedlist;

import java.util.*;


/*class DNode {
    int  item;
    DNode next;
    DNode prev;

    DNode(DNode prev, int element, DNode next) {
        this.item = element;
        this.next = next;
        this.prev = prev;
    }
}*/
public class LRUCacheImpl {

    public static void main(String[] args) {
        LRUCacheImpl l = new LRUCacheImpl(3);
        l.put(1,1);
        System.out.println(l.get(1));
        l.put(2,2);
        l.put(3,3);
        System.out.println(l.get(2));
    }
    private int cap;
    Queue<Map<Integer, Integer>> ddl = new LinkedList<>();
    private Map<Integer, Integer> cache = new HashMap<>();
    Map<Integer,  Queue<Map<Integer, Integer>>> address = new HashMap<>();
    int size;
    public LRUCacheImpl(int capacity){
        this.cap=capacity;
    }

    public void put(int key, int value){

        if(address.get(key) != null){
            //address.
        }
        if(size >= cap){
            Map<Integer, Integer> cc = ddl.remove();
           // cache.remove(cc.get())
        }
        cache.put(key, value);
        ddl.add(cache);
        address.put(key, ddl);
        size++;

    }

    public int get(int key){
        if(cache.get(key) == null)
            return -1;
        Queue<Map<Integer, Integer>>  temp = address.get(key);
        //temp.poll();
        int value = temp.poll().get(key);
        ddl.add(cache);
        return value;
    }
}
