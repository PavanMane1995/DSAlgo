package binarytree;

public class ValidateBinaryTree {
    public static void main(String[] args) {

        BinaryTree bt = new BinaryTree();
        bt.root = new Node(5);
        bt.root.left = new Node(4);
        bt.root.right = new Node(5);
        bt.root.left.left = null;
        bt.root.left.right = null;
        bt.root.right.left = new Node(3);
        bt.root.right.right = new Node(7);


        System.out.println(validateBinaryTree(bt.root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

    public static boolean validateBinaryTree(Node root, Integer min, Integer max){
        if(root == null){
            return true;
        }
        if((min != null && root.key <= min) || (max != null && root.key >= max )){
            return false;
        }
        return validateBinaryTree(root.left, min, root.key) && validateBinaryTree(root.right, root.key, max);
    }

}
