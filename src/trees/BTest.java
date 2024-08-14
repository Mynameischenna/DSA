package trees;

import java.util.Scanner;

public class BTest {
    static class Node{
        private final int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

    }
    // ROOT NODE
    Node root;
    public BTest() {

    }
    public void addNode(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the root node");
        int value = -1;
        try{
            value = sc.nextInt();
        }catch (Exception e){
            System.out.println("Enter Valid Value ");
            return;
        }
        root = new Node(value);
        addNode(root,sc);
    }

    private void addNode(Node node,Scanner sc){
        System.out.println("enter left node of this "+node.value);
        sc.nextLine();
        int leftValue = sc.nextInt();
        if(leftValue != -1){
            node.left = new Node(leftValue);
            addNode(node.left,sc);
        }

        System.out.println("enter right node of this "+node.value);
        int rightValue = sc.nextInt();
        if(rightValue != -1){
            node.right = new Node(rightValue);
            addNode(node.right,sc);
        }

        }
    public void display(Node root){
        if(root == null) return;
        System.out.print(root.value+" ");
        display(root.left);
        display(root.right);
    }

    public static void main(String[] args) {
        BTest bt = new BTest();
        bt.addNode();
        bt.display(bt.root);
    }
}
