package LinkedList.DoubleLinkedList.SinglelLinkedList;

public class CustomeLL {
    public Node head;
    private Node tail;
    private int size;
    public boolean isEmpty(){
        return head == null;
    }
    public int size(){
        return size;
    }
    public CustomeLL() {
        this.size = 0;
    }
    public Node reverse(Node node){
        Node nx = node.next;
        Node futu = nx.next;
        while(futu != null ){
            futu = nx.next;
            nx.next = node;
            node = nx;

            nx= futu;
        }
        return node;
    }
    public void revLL(Node head){
        if(head == tail){
            head = tail;
           return;
        }
        revLL(head.next);
        tail.next = head;
        tail = head;
        tail.next = null;
    }
    public void dull(){
        Node temp = head;
        revLL(temp);
    }
    public void insert(int index, int value) throws ArithmeticException{
        Node node = new Node(value);
        int i=0;
        Node temp = head;

        if(index > size){
            throw new ArithmeticException("index out of bounds");
        }

        if(index == 0){
            insertFirst(value);
            return;
        }
        if(index == size){
            insertLast(value);
            return;
        }
        while(i < index-1){
            temp = temp.next;
            i++;
        }
        node.next = temp.next;
        temp.next = node;
        size++;


    }
   public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail == null) tail = head;
        size++;
   }
   public void insertLast(int value){
        Node node = new Node(value);
       if(tail == null){
           insertFirst(value);
           return;
       }
       else{
           tail.next = node;
           tail = node;
       }
       size++;
   }

    public void display() {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+"->");
            temp= temp.next;
        }
    }

    public int deleteFirst(){
        if(head == null) return -1;// if head is null
       int val = head.value;
       head = head.next;
       if(head == null) tail = null; // if we have only one elementsize--;
       size--;
       return val;

    }
    public int deleteLast(){
        Node current = get(size -2);
        int ans = tail.value;
        tail = current;
        current.next = null;
        size--;
        return ans;
    }
    public int delete(int index){
        if(index == 0) return deleteFirst();
        if(index == size-1) return deleteLast();
        Node current = get(index-1);
        int val = current.next.value;
        current.next = current.next.next;
        size--;
        return val;
    }
    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
    // reverse using recurssion


    // Node class
    private static class  Node{
        private final int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

//        public Node(int value, Node next) {
//            this.value = value;
//            this.next = next;
//        }
    }
}
