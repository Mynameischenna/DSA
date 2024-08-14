package LinkedList.DoubleLinkedList.SinglelLinkedList.practice;

public class LinkedList {
    public Node head;
    public Node tail;
    LinkedList(){
        this.head = new Node(0);
        tail = head;
    }
    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }


    public void insert(int val){
        Node node = new Node(val);
        if(head.next == null){
            head.next = node;
            tail.next = node;
        }
        else{
            tail.next = node;

        }
        tail = tail.next;
    }
    public void changenode(){

        Node temp = head.next;
//        temp = null;
        while(temp != null){
            temp.val = 23;
            temp = temp.next;
        }
    }
    public void display(){
        Node temp = head.next;
        while(temp != null){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.println();
    }
}
