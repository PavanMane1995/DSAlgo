package binarytree;

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
    }

}

class Node {
    int key;
    Node left;
    Node right;

    public Node(int key){
        this.key = key;
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
        System.out.print(node.key+ ", ");
        preOrder(node.left);
        preOrder(node.right);

    }

    //PostOrder Traversal
    void postOrder(Node node){
        if(node ==  null){
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.key+ ", ");
    }

    //PostOrder Traversal
    void inOrder(Node node){
        if(node ==  null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.key + ", ");
        inOrder(node.right);

    }
}