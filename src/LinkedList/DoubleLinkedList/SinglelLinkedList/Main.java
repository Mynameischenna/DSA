package LinkedList.DoubleLinkedList.SinglelLinkedList;


public class Main {
    void reverse( Node node){
        Node temp = node;
        while(temp!= null){
            System.out.println(temp.value);
        }
    }
    public static void main(String[] args) {
        CustomeLL ll = new CustomeLL();

//        System.out.println(ll.isEmpty());
//        ll.insert(0,11);
//        ll.insertFirst(10);
//        ll.insertFirst(20);
        ll.insertLast(23);
        ll.insertLast(65);
        ll.insertLast(33);
        ll.insertLast(29);
//        ll.insert(2,9);
//        ll.insert(6,31);
//        ll.display();
//        System.out.println();
//        ll.dull();
//        ll.display();

//        ll.revLL();

        // deletion
//        System.out.println("deleted item "+ll.deleteFirst());
//        System.out.println("deleted last  item "+ll.deleteLast());
//        System.out.println("delete by index"+ll.delete(4));
//        System.out.println("delete by index"+ll.delete(0));
//        ll.display();
//        System.out.println(ll.isEmpty());
        System.out.println();
        System.out.println("size is "+ll.size());
    }

    public static class Node {
        int value ;
        Node next ;

        public Node(int value) {
            this.value = value;
        }
    }
}
