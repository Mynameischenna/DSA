package trees;

public class BinarySearchTree {

    static class Node {
        int value;
        Node left;
        Node right;
        int height;

        Node(int value) {
            this.value = value;
        }

    }
    public int height(Node node){
        if(node == null) return 0;
        return node.height;
    }
    // root node
    Node root;

    BinarySearchTree(int rootValue) {
        root = new Node(rootValue);
    }

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
        return node;
    }
    // if i give array as input and it is sorted
    // insert from middle
    public void addNodeSorted(int[] nums){
        addNodeSorted(nums,0,nums.length);
    }
    private  void addNodeSorted(int[] nums,int start,int end){

        if( start >= end){
            return;
        }
        int mid = (start+end)/2;
        addNode(nums[mid]);
        addNodeSorted(nums,start,mid);
        addNodeSorted(nums,mid+1,end);

    }
    public int findHeight(Node node){
        return node.height;
    }
    public boolean isBlanced(Node node){
        if(node == null) return true;
        return Math.abs(height(node.left)-height(node.right)) <= 1 && isBlanced(node.left) && isBlanced(node.right);
    }
    public void Preorder(Node root) {
        if (root == null) return;
        System.out.println(root.value);
        Preorder(root.left);
        Preorder(root.right);
    }
    public void Postorder(Node root) {
        if (root == null) return;

        Postorder(root.left);
        Postorder(root.right);
        System.out.println(root.value);
    }
    public void Inorder(Node root) {
        if (root == null) return;

        Inorder(root.left);
        System.out.println(root.value);
        Inorder(root.right);
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree(45);

//        bst.addNode(30);
//        bst.addNode(60);
//        bst.addNode(20);
//        bst.addNode(35);
//        bst.addNode(50);
//        bst.addNode(70);
//        bst.addNode(77);
//        int[] arr = {1,2,3,4};
        bst.addNodeSorted(new int[]{1,2,3,4});  // inserting by an array
//        System.out.println("is balanced tree :"+bst.isBlanced(bst.root));
//        System.out.print(bst.findHeight(bst.root.left)+" ");

        bst.Preorder(bst.root); // Output will be in preorder: 45 30 20 35 60 50 70
    }
}
