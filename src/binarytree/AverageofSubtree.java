package binarytree;

public class AverageofSubtree {

    static int count;
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.root = new Node(1);
        bt.root.left = null;
        bt.root.right = new Node(3);
        bt.root.right.right = new Node(1);
        bt.root.right.right.right = new Node(3);
        int res = helper(bt.root);
        System.out.println( count);
    }

    public static int helper(Node root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            count++;
            return root.val;
        }
        int left = helper(root.left);
        int right = helper(root.right);
        if(root.left == null || root.right == null){
            if(right+root.val/2 == root.val || left+root.val/2 == root.val){
                count++;
            }
            int r = root.left != null ? left : right;
            return (r+root.val)/2;
        }else if(root.right!= null && root.left!= null && (int)(left+right+root.val)/3 == root.val){
            count++;
        }
        return (left+right+root.val)/3;
    }
}
