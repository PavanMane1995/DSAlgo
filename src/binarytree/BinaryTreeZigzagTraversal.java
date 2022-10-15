package binarytree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigzagTraversal {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.root = new Node(1);
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.left.left = new Node(4);
        bt.root.left.right = new Node(5);
        bt.root.right.right = new Node(6);
        bt.root.right.right.right = new Node(7);

        System.out.println(zigzagLevelOrder(bt.root));
    }

    public static List<List<Integer>> zigzagLevelOrder(Node root) {

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        boolean flag = false;
        List<List<Integer>> outer = new ArrayList<>();
        List<Integer> inner = new ArrayList<>();

        while( !q.isEmpty() ){
            Node cur = q.remove();

            if(cur == null){

                outer.add(inner);
                //initializing new list
                inner = new ArrayList<>();
                if(q.isEmpty()){
                    break;
                }
                q.add(null);
                flag = !flag;
            }else{
                if(flag){
                    inner.add(0, cur.val);
                }else{
                    inner.add(cur.val);
                }
                if(cur.left != null){
                    q.add(cur.left);
                }
                if(cur.right != null){
                    q.add(cur.right);
                }
            }
        }

        return outer;
    }

}
