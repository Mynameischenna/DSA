package trees;


public class AVL {

    static class Node {
        int value;
        Node left;
        Node right;
        int height;

        Node(int value) {
            this.value = value;
        }

    }
    public int height(){
        return height(root);
    }
    public int height(Node node){
        if(node == null) return -1;
        return node.height;
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

        node.height = Math.max(height(node.left) ,height(node.right))+1;

        return rotate(node);
    }
    public Node rotate(Node node){
        // if it is positive it is left weighted tree, bcs it have more depth in lef side
        if(height(node.left) - height(node.right)>1){
           if(height(node.left.left) - height(node.left.right) > 0){
               // left-left case
               return rightRotate(node);
           }
            if(height(node.left.left) - height(node.left.right) < 0){
                // left-right case
                node.left = leftRotate(node.left); // left rotate on c
                return rightRotate(node); //right rotate on p
            }
        }
        // right heavy
        // right side has more height
        if(height(node.left) - height(node.right) < -1){
            if(height(node.right.left) - height(node.right.right) < 0){
                // right - right  case, left rotate on p
                return leftRotate(node);
            }
            if(height(node.right.left) - height(node.right.right) > 0){
                // right-left case
                node.right = rightRotate(node.right); // right rotate on c
                return leftRotate(node); //left rotate on p
            }

        }
        return node;
    }

    private Node leftRotate(Node c) {
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;

        // update the height
        p.height = Math.max(height(p.left),height(p.right)+1);
        c.height = Math.max(height(c.left),height(c.right)+1);

        return p;
    }

    private Node rightRotate(Node p) {
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        // update the height
        p.height = Math.max(height(p.left),height(p.right)+1);
        c.height = Math.max(height(c.left),height(c.right)+1);
        return c;
    }

    public static void main(String[] args) {
       AVL bst = new AVL();
        for (int i = 0; i < 1000; i++) {
            bst.addNode(i);
        }
        System.out.println(bst.height());

    }
}
