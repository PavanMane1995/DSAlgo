package binarytree;

import java.util.*;

public class BinaryTreeInPrePostOrderTraversal {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.root = new Node(1);
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.left.left = new Node(4);
        bt.root.left.right = new Node(5);
        bt.root.right.right = new Node(6);

        System.out.println("PreOrder -");
        bt.preOrder(bt.root);
        System.out.println();
        System.out.println("PostOrder -");
        bt.postOrder(bt.root);
        System.out.println();
        System.out.println("InOrder -");
        bt.inOrder(bt.root);
        System.out.println();
        bt.levelOrder(bt.root);

       // System.out.println(bt.fib(3));
    }

}

class Node {
    int val;
    Node left;
    Node right;
    int count =0;

    public Node(int val){
        this.val = val;
    }

    public Node getLeft(){
        return left;
    }
}
class BinaryTree{
    Node root;
    public BinaryTree(){
        root = null;
    }

    //preOrder traversal
    void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.val + ", ");
        preOrder(node.getLeft());
        preOrder(node.right);
        List<Integer> l = new ArrayList<>();

    }

    //PostOrder Traversal
    void postOrder(Node node){
        if(node ==  null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.val + ", ");
    }

    //PostOrder Traversal
    void inOrder(Node node){
        if(node ==  null){
            return;
        }
        inOrder(node.left);  //Node 1, Node 2, Node 4, Node null
        System.out.print(node.val + ", ");
        inOrder(node.right);

    }

    //BFS
    void levelOrder(Node root){
        Queue<Node> q = new PriorityQueue<>();
        q.add(root);
        //Just to recognize new line added null
        q.add(null);

        while (!q.isEmpty()){
            Node curNode = q.remove();
            if(curNode == null){
                System.out.println();
                if(q.isEmpty())
                    break;
                else
                    q.add(null);
            }else{
                System.out.print(curNode.val + "-");
                if(curNode.left != null){
                    q.add(curNode.left);
                }
                if(curNode.right != null){
                    q.add(curNode.right);
                }
            }
        }

    }


    public int fib(int n){
        if(n < 2){
            return 1;
        }
         int a =fib(n-1);
        int b = fib(n-2);
        return a+b;
    }
}