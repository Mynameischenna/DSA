package LinkedList.DoubleLinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList  dl = new DoubleLL();
        dl.insertFirst(12);
        dl.insertFirst(31);
        dl.insertLast(33);
        dl.insertLast(29);
        dl.insert(37,1);
        dl.display();
//        dl.deleteFirst();
//        dl.deleteLast();
        dl.delete(2);
        dl.displayRev();
        System.out.println(dl.size());
    }
}
