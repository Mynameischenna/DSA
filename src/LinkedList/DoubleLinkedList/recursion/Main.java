package LinkedList.DoubleLinkedList.recursion;

public class Main {
    public  static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
    }
    public  static Node rev(Node head){
        if(head.next == null){
            return head;
        }
        Node newHead = rev(head.next);
        System.out.println("new head"+newHead.value+" "+head.value);
        // Change pointers
        head.next.next = head;
        head.next = null;

        return newHead;
    }
    public static Node insert(Node node,int index,int value){
        if(index == 0){
            Node fd = new Node(value);
            fd.next = node;
            node = fd;
            return node;
        }
        if(index-1 == 0){
            Node fd = new Node(value);
            fd.next = node.next;
            node.next = fd;
            return node;
        }
        // Recursive call to move to the next node
        if (node.next != null) {
            insert(node.next, index-1, value);
        }
        return node;
    }
    static Node tail = null;
    static void setTail(Node head){
        while(head.next != null){
            head = head.next;
        }
        tail = head;
    }
    static void  addEnd(Node node){
        Node dummyTail = tail;
        dummyTail.next = node;
        dummyTail = dummyTail.next;
    }
    static void oddEven(Node head){
        Node temp = head;
        while(temp.next != null && temp != tail){
            System.out.println("tail "+tail.value);
            System.out.println(" temp val"+temp.value);
            if(temp.next.value % 2 ==0){
                addEnd(temp.next);
                temp.next = temp.next.next;
            }
//            else {
//                temp = temp.next;
//            }
        }

    }

    static void changeRef(Node temp){
        Node dummy = new Node(0);
        dummy.next = temp;
        dummy.next.value = 99;
        display(dummy);
        System.out.println("after dummy");
        Node head = temp;
        if (head != null && head.next != null) {
            head.next = head.next.next;  // This removes the second node
        }
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        display(head);
        System.out.println();
        changeRef(head);
//        setTail(head);
//        System.out.println(tail.value);
        display(head);
//        oddEven(head);
//        display(head);

//        display(rev(head));
//        display(insert(head,0,33));


    }
}
