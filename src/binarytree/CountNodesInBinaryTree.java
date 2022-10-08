package binarytree;

public class CountNodesInBinaryTree {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.root = new Node(1);
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.left.left = new Node(4);
        bt.root.left.right = new Node(5);
        bt.root.right.right = new Node(6);


        System.out.println(count(bt.root));
    }

    public static int count(Node root){
        if(root == null){
            return 0;
        }
        //int count = c+1;
        int l = count(root.left);
        //count = count+1;
        int r =count(root.right);
        //count = count+1;
        return l+r+1;


    }

}

