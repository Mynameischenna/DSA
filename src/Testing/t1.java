package Testing;

import java.util.Scanner;

public class t1 {
    class Node{
        private int data;
        private Node left;
        private Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    private static Node root;
    private void insert(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter root value");
        int val = sc.nextInt();
        root = new Node(val);
        insertNext(root,sc);
    }

    private void insertNext(Node node, Scanner sc) {

        System.out.println("enter left val of "+node.data);
        int left = sc.nextInt();

        if(left != -1){
            node.left  = new Node(left);
            insertNext(node.left,sc);
        }

        System.out.println("enter right val of "+node.data);
        int right = sc.nextInt();
        if(right != -1){
            node.right = new Node(right);
            insertNext(root.right,sc);
        }

//        System.out.println("enter left val of "+node.data);
//        int left = sc.nextInt();
//
//        if(left != -1){
//            node.left  = new Node(left);
//            insertNext(node.left,sc);
//        }
//
//        System.out.println("enter right val of "+node.data);
//        int right = sc.nextInt();
//        if(right != -1){
//            node.right = new Node(right);
//            insertNext(root.right,sc);
//        }

    }
    private void display(Node root){
        if(root == null) return;;

        System.out.print(root.data+" ->");
        display(root.left);
        display(root.right);
    }
    public static void main(String[] args) {
        t1 t = new t1();
        t.insert();
        t.display(root);
    }
}
