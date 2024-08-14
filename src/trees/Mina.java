package trees;

import java.util.Scanner;

public class Mina {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        BinaryTree bt = new BinaryTree();
        bt.addRoot(sc);
        bt.inorder(bt.root);
//
//        BinarySearchTree bst = new BinarySearchTree();
//        bst.addNode(21, bst.root);
//        bst.addNode(3, bst.root);
//        bst.addNode(29, bst.root);
//        bst.addNode(14, bst.root);
//
//        bst.display(bst.root);
    }
}
