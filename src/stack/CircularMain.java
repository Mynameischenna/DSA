package stack;

public class CircularMain {
    public static void main(String[] args) throws Exception {
//        CircularQueue queue = new CircularQueue(4);
//        queue.insert(10);
//        queue.insert(20);
//        queue.insert(30);
//        queue.insert(40);
////        queue.insert(10);
//        queue.display();
//
//        System.out.println(queue.remove());
//        queue.insert(21);
//        queue.display();
////        System.out.println(queue.peek());


        // dynamic circular queue
        DynamicCircularQueue queue = new DynamicCircularQueue(4);
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.insert(10);
        queue.display();

        System.out.println(queue.remove());
        queue.insert(21);
        queue.display();
//        System.out.println(queue.peek());

    }
}
