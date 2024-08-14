package trees;

import java.util.Scanner;

public class BinaryTree {
    class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }
    // root node
    Node root;
    public void addRoot(Scanner sc){
        System.out.println("enter root node ");
        int value = sc.nextInt();
        root = new Node(value);
        addnext(root,sc);
    }
    public void addnext(Node node,Scanner sc){
        System.out.println("enter left node of "+node.data);
        int value = sc.nextInt();
        if(value!=-1){
            node.left = new Node(value);
            addnext(node.left,sc);
        }
        System.out.println("enter right node of "+node.data);
        value = sc.nextInt();
        if(value!=-1){
            node.right = new Node(value);
            addnext(node.right,sc);
        }
    }
    //diplay
    public void inorder(Node node){
        if(node == null) return;
        System.out.print(" "+node.data);
        inorder(node.left);
        inorder(node.right);
    }
}
