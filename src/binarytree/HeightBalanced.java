package binarytree;



public class HeightBalanced {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.root = new Node(5);
        bt.root.left = new Node(4);
        bt.root.right = new Node(5);
        bt.root.left.left = null;
        bt.root.left.right = null;
        bt.root.right.left = new Node(3);
        bt.root.right.right = new Node(7);

        System.out.println(isBalanced(bt.root));
    }

    public static boolean isBalanced(Node root) {

        if(root == null){
            return true;
        }
         int i = hightHelper(root);

        return  i != -1;

    }

    public static int hightHelper(Node head){
        if(head == null){
            return 0;
        }
        int left =hightHelper(head.left);
        int right =hightHelper(head.right);
        if(left == -1 || right == -1 || Math.abs(left - right) > 1){
            return -1;
        }

       return Math.max(left, right)+1;
    }

}
