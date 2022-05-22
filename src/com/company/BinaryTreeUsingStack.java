package com.company;

import java.util.Stack;

public class BinaryTreeUsingStack {

    public static void main(String[] arg){
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.left.left.right = new Node(5);
        printBinary(root);
    }

    public static void printBinary(Node node){

        Node curr = node;
        Stack<Node> s = new Stack<>();
        while(curr !=null || s.size() > 0 ){

            while(curr !=null){
                s.push(curr);
                curr = curr.left;
            }
            curr = s.pop();
            System.out.println(curr.data);
            curr = curr.right;
        }
    }
}

class Node
{
    int data;
    Node left, right;

    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}
