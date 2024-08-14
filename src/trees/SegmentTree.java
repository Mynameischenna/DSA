package trees;

public class SegmentTree {
    class Node{
        private int sum;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        public Node(int startInterval,int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }
    Node root;
    public void insert(int[] arr){
        root = insert(arr,0,arr.length-1);
    }
    private Node insert(int[] arr,int s,int e){
        if(s == e){
            Node temp = new Node(s,e);
            temp.sum = arr[s];
            return temp;
        }
        Node node = new Node(s,e);
        int mid = (s+e)/2;
        node.left = insert(arr,s,mid);
        node.right = insert(arr,mid+1,e);
        node.sum = node.left.sum + node.right.sum;

        return node;
    }
    public int query(Node node,int s,int e){

        //node is compeletely inside query
        if(node.startInterval >= s &&  node.endInterval <= e){
            return node.sum;
        }
        // outside
        else if(node.endInterval < s || node.startInterval > e ){
            return 0;
        }
        //over lapping
        else{
            return this.query(node.left,s,e)+ this.query(node.right,s,e);
        }
    }
    public void display(Node root){
        if(root == null) return;
        System.out.println(root.sum+" s:"+root.startInterval+" e:"+ root.endInterval);

        display(root.left);
        display(root.right);
    }
    public void update(int index, int value){
        root.sum = update(root,index,value);
    }
    private int update(Node node,int index,int value) {
        // checks whether the index is in range of node
        if (index >= node.startInterval && index <= node.endInterval) {
            if (index == node.startInterval && index == node.endInterval) {
                node.sum = value;
                return node.sum;
            } else {
                int left = update(node.left, index, value);
                int right = update(node.right, index, value);

                node.sum = left+right;
                return node.sum;
            }
        }
        // index is not in range of node
        return node.sum;
    }

    public static void main(String[] args) {
        SegmentTree sg = new SegmentTree();
        int[] arr = {3,8,7,6,-2,-8,4,9};
        sg.insert(arr);

        sg.update(2,8);
        sg.display(sg.root);
        System.out.println(sg.query(sg.root,2,4));
    }
}
