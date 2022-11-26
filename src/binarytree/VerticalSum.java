package binarytree;

import javafx.beans.binding.MapExpression;

import javax.swing.tree.TreeNode;
import java.util.HashMap;

public class VerticalSum {
    private static HashMap<Integer, Integer> hm = new HashMap<>();
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.root = new Node(5);
        bt.root.left = new Node(4);
        bt.root.right = new Node(5);
        bt.root.left.left = null;
        bt.root.left.right = null;
        bt.root.right.left = new Node(3);
        bt.root.right.right = new Node(7);
        verticalSum(bt.root, 0);
        System.out.println(hm.values());
    }

    public static void verticalSum(Node node, int hd){
        if(node == null) return;

        verticalSum(node.left, hd-1);
        int sum = hm.get(hd) != null ? (hm.get(hd)+ node.val) : node.val;
        hm.put(hd, sum);
        verticalSum(node.right, hd+1);
    }
}
