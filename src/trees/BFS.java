package trees;

import java.util.ArrayList;

public class BFS {
    static class Node {
        int value;
        Node left;
        Node right;
        int mark ;

        public Node(int value) {
            this.value = value;
        }
    }
    // root node
    Node root;

    public void addNode(int value) {
        root = addNodeRec(root, value);
    }

    private Node addNodeRec(Node node, int value) {
        if (node == null) {
            node = new Node(value);
            return node;
        }

        if (value < node.value) {
            node.left = addNodeRec(node.left, value);
        } else if (value > node.value) {
            node.right = addNodeRec(node.right, value);
        }
        return node;
    }
    public void Preorder(Node root) {
        if (root == null) return;
        System.out.print(root.value+" ");
        Preorder(root.left);
        Preorder(root.right);
    }
    public Node getNode(Node root,int value){
        if (root == null) return null;

        // Check the current node
        if (root.value == value && root.mark != 1) return root;

        // Recursively check the left subtree
        Node leftResult = getNode(root.left, value);
        if (leftResult != null) return leftResult;

        // Recursively check the right subtree
        return getNode(root.right, value);

    }
    ArrayList<Integer> list = new ArrayList<>();
    public void helper(){
        list.add(root.value);
        for (int i = 0; i < list.size(); i++) {
            Node node = getNode(root,list.get(i));
            BFS1(node);
        }
    }
    public void BFS1(Node root){
        if(root == null || root.mark == 1) return;
        if(root.left != null) list.add(root.left.value);
        if(root.right != null) list.add(root.right.value);
        root.mark = 1;
    }
    public static void main(String[] args) {
        BFS tree = new BFS();
//        int[] arr = {21,5,8,23,42,1,12,5,46,78,1,8};
//        for(int i:arr){
//            bfs.addNode(i);
//        }
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(3);
        tree.root.right.right = new Node(3);
        tree.Preorder(tree.root);
        System.out.println();
//        System.out.println((bfs.getNode(bfs.root,1)).value);
        tree.helper();
        System.out.println("list "+tree.list);
    }
}
