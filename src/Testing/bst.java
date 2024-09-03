package Testing;

public class bst {
    class Node{
        private int data;
        private Node left;
        private Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    private static Node root;
    private void addNode(int value){
        root = addNode(root,value);
    }
    private void addNode(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            root = addNode(root,arr[i]);
        }
    }


    private Node addNode(Node root, int value) {
        if(root == null)
        {
            Node node = new Node(value);
            return node;
        }
        if(value < root.data){
            root.left = addNode(root.left,value);
        }

        if(value > root.data){
            root.right = addNode(root.right,value);
        }
        return root;
    }
    private void display(Node root){
        if(root == null) return;
        System.out.print(root.data+" ->");
        display(root.left);
        display(root.right);
    }

    public static void main(String[] args) {
        bst b = new bst();
//        b.addNode(20);
//        b.addNode(19);
//        b.addNode(22);
//        b.addNode(2);
        b.addNode(new int[]{12,4,23,1,34});

        b.display(root);
    }
}
