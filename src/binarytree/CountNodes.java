package binarytree;

import javax.swing.tree.TreeNode;

public class CountNodes {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.root = new Node(1);
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.left.left = new Node(4);
        bt.root.left.right = new Node(5);
        bt.root.right.right = new Node(6);
        bt.root.right.right.right = new Node(6);
        //bt.root.right.right.left = new Node(1);

        System.out.println(count(bt.root));
    }

    public static int count(Node root){
        if(root == null){
            return 0;
        }
         int left= count(root.left);
         int right =count(root.right);

         return left +1;
    }
}
