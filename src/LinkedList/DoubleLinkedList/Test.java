package LinkedList.DoubleLinkedList;
// reverse ll
public class Test {
    public static void main(String[] args) {
        Node head;
        Node n1 = new Node(10);
        head = n1;
        Node n2 = new Node(20);
        n1.next = n2;
        Node n3 = new Node(30);
        n2.next = n3;
        Node n4 = new Node(40);
        n3.next = n4;

//        Node temp = head;
//        Node temp1 = null; // Initialize temp1 to null for the initial call
//        printRev(temp, temp1);
//
//        // Print reversed list
//        System.out.println("Reversed list:");
//        printList(head);
//
        // insert
        int val = 21;
        int index = 0 ;
        Node node = head;
        Node node1 = new Node(val);

        Node prev = insert1(val,index,node);
        if(prev == head){
            node1.next = head;
            head = node1;

        }
        else if(prev == null){
            System.out.println("not valid positino");
        }
        else if(prev.next == null){
            prev.next = node1;
            printList(head);

        }
        else{
            node1.next = prev.next;
            prev.next = node1;
        }
        node = head;
        printList(node);
    }

    private static Node insert1(int val, int index, Node node) {
        if(index <= 1 || node == null){
            return node;
        }
        return insert1(val,index-1,node.next);
    }


    static void printRev(Node head, Node temp1) {
        if (head == null) {
            return;
        }
        printRev(head.next, head); // Pass the current head as temp1 for the next call
        if (temp1 != null) {
            temp1.next = null; // Break the link
            head.next = temp1; // Reverse the link
        }
    }

    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }
}
