package LinkedList.DoubleLinkedList;

public class DoubleLL implements LinkedList{
    private Node head;
    private Node tail;
    private int size;

    public DoubleLL() {
        this.size = 0;
    }

    @Override
    public void insertFirst(int value) {
        Node node = new Node(value);
        if (head == null){
            head = node;
            tail = head;
        }
        else{
            node.next = head;
            head.prev = node;
            head = node;
        }
        size++;

    }

    @Override
    public void insertLast(int value) {
        if(tail == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        node.prev = tail;
        tail = node;
        size++;
    }

    @Override
    public void insert(int value, int index) {
        // zero based index
        if( index == 0) {
            insertFirst(value);
            return;
        }
        if (index == size){
            insertLast(value);
            return;
        }
        Node node = new Node(value);
        Node current = get(index-1);
        node.next = current.next;
        current.next.prev = node;
        current.next = node;
        node.prev = current;
        size++;

    }

    @Override
    public void display() {
        Node temp = head;
        while(temp !=null){
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.println();
    }
    @Override
    public void displayRev() {
        Node temp = tail;
        while(temp !=null){
            System.out.print(temp.value+"<-");
            temp = temp.prev;
        }
        System.out.println();
    }
    @Override
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }
    @Override
    public int deleteLast(){
        int val = tail.value;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }
    @Override
    public int delete(int index){
        if(index==0) return deleteFirst();
        if(index == size-1) return deleteLast();
        Node current = get(index);
        int val = current.value;
        current.prev.next = current.next;
        current .next.prev = current.prev;
        size--;
        return val;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Node get(int index) {
        Node node = head;
        int i=0;
        while(i < index){
            i++;
            node = node.next;
        }
        return node;
    }
//    @Override
//    public void update(int value, int index){
//        Node node = get(index);
//        node.value = value;
//    }


    // node class
    public static class Node{
        private final int value;
        private Node prev;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}

