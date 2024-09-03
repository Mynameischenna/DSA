package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
    List<List<Integer>> lis = new ArrayList<>();
    public void levelOrder(Node root){// itertive approach
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while ((!queue.isEmpty())){
            List<Integer> l = new ArrayList<>();
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                Node curr = queue.poll();
                l.add(curr.value);
                if(curr.left != null){
                    queue.offer(curr.left);
                }
                if(curr.right != null){
                    queue.offer(curr.right);
                }
            }
            lis.add(l);
        }
        System.out.println("Level order tarvesal"+lis);
    }
    List<List<Integer>> recLiss = new ArrayList<>();
    public void BFS(){// recurssive way of level order

        levelOrder(root,0,recLiss);
        System.out.println(" recurssive way"+recLiss);
    }
    public void levelOrder(Node root,int level,List<List<Integer>> lis){
        if(root == null) return;

        if(level >= lis.size()){
            lis.add(new ArrayList<>());
        }

        lis.get(level).add(root.value);

        levelOrder(root.left,level+1,lis);
        levelOrder(root.right,level+1,lis);
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
//        tree.levelOrder(tree.root);
        tree.BFS();
    }}
