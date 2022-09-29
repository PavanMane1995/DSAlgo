package binarytree;

public class HeightOfBinaryTree {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.root = new Node(1);
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.left.left = new Node(4);
        bt.root.left.right = new Node(5);
        bt.root.right.right = new Node(6);
        bt.root.right.right.right = new Node(7);

        System.out.println(height(bt.root));
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }

        int left = height(root.left);
        int right = height(root.right);
        int max = Math.max(left, right) + 1;

        return max;
    }
}
