package stack;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CustomeQueue queue = new CustomeQueue(5);
        queue.insert(10);
        queue.insert(20);
        queue.insert(130);
        queue.insert(40);
        queue.insert(40);
        System.out.println(queue.remove());
        queue.display();

    }
}
