package LinkedList.DoubleLinkedList.CLL;

public class CircularLL {
    private Node head;
    private Node tail;
    static class Node{
        private final int value;
        private Node next;

        public Node(int val) {
            this.value = val;
        }
    }
    public void insert(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = tail.next;
    }
    public void display(){
        if(head == null) {
            System.out.print("->");
            return;
        }
        Node temp = head;

        do{
            System.out.print(temp.value+"->");
            temp = temp.next;
        }while(temp != head);
        System.out.print("HEAD");
    }
    public  void delete(int val){
        // check head
        if(head == null) return;
        if(head.value == val){
            // only one element that too its head
            System.out.println(head.next);
            if(head.next == null){
                head = null;
                tail = null;
                return;
            }
            // head element but contains pother elements too
            head = head.next;
            tail.next = head;
            return;
        }
        //check tail value
        if(tail.value == val){
            if(tail.next == null){
                head = null;
                tail = null;
                return;
            }
            // contains elements
            Node temp = head;
            while( temp.next != tail){
                temp = temp.next;
            }
            temp .next = head;
            tail = temp;
            return;
        }
        // some middle value
        Node temp = head;
        while(temp.next != null){
            if(temp.next.value == val){
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }
}
