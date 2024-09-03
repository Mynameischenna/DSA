package trees;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SuccessorOfNode {
    static class Node {
        Node left, right;
        int value;
    }

    // Utility function to create a
// new node with given value
    static Node newNode(int value)
    {
        Node temp = new Node();
        temp.left = null;
        temp.right = null;
        temp.value = value;

        return temp;
    }
    // level order in a list of list
    public List<List<Integer>> levelOrder(Node root) {

        List<List<Integer>> result = new ArrayList();
        if(root == null) return result;
        Queue<Node> nodes = new LinkedList();
        nodes.offer(root);
        while(!nodes.isEmpty()){
            List<Integer> internal = new ArrayList();
            int size = nodes.size();
            for(int i=0;i<size;i++){
                Node curr = nodes.poll();
                internal.add(curr.value);
                if(curr.left != null) nodes.offer(curr.left);

                if(curr.right != null) nodes.offer(curr.right);
            }
            result.add(internal);

        }
        return result;
    }
    public Node successorOfNode(Node root,int key) {
        if(root == null) return null;
        Queue<Node> nodes = new LinkedList<>();
        nodes.offer(root);
        while(!nodes.isEmpty()){
                Node curr = nodes.poll();
                if (curr.left != null) nodes.offer(curr.left);
                if (curr.right != null) nodes.offer(curr.right);

                if (curr.value == key) break;
            }


        return nodes.poll();
    }
    public List<List<Integer>> zigzagLevelOrder(Node root) {

        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        Queue<Node> nodes = new LinkedList<>();
        nodes.offer(root);
        int l=1;
        while(!nodes.isEmpty()){
            List<Integer> internal = new ArrayList<>();
            int size = nodes.size();
            for(int i=0;i<size;i++){
                Node curr = nodes.poll();
                internal.add(curr.value);
                if(curr.left != null) nodes.offer(curr.left);

                if(curr.right != null) nodes.offer(curr.right);
            }
            l = l==1?0:1;
            if(l == 1) reverse(internal);
            result.add(internal);

        }
        return result;
    }
    public void reverse(List<Integer> result){
        int i=0 , j =result.size()-1;

        while(i < j){
            int tenp = result.get(i);
            result.set(i,result.get(j));
            result.set(j,tenp);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        SuccessorOfNode sc = new SuccessorOfNode();
        Node root = newNode(20);
        root.left = newNode(10);
        root.left.left = newNode(4);
        root.left.right = newNode(18);
        root.right = newNode(26);
        root.right.left = newNode(24);
        root.right.right = newNode(27);
        root.left.right.left = newNode(14);
        root.left.right.left.left = newNode(13);
        root.left.right.left.right = newNode(15);
        root.left.right.right = newNode(19);

        System.out.println("level order "+sc.levelOrder(root));
        System.out.println(sc.successorOfNode(root,4).value);

    }
}
