package stack;

public class CustomeQueue {

    static int[] queue;
    static int end = 0;
    private static final int DEFAULT_SIZE = 10;
    public CustomeQueue() {
        queue = new int[DEFAULT_SIZE];

    }
    public CustomeQueue(int size) {
        queue = new int[size];
    }

    public boolean insert(int value) throws Exception {
        if(isFull()){
            throw new Exception("Queue if full");
        }
        queue[end++] = value;
        return true;
    }
    public int remove() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is empty you cant delete");
        }
        int removed = queue[0];
        // move back
        for (int i = 1; i < end; i++) {
            queue[i-1] = queue[i];
        }
        end--;
        return removed;
    }
    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(queue[i]+" ");
        }
        System.out.println();
    }
    public int peek() throws Exception {
        if(isEmpty()) throw new Exception("Queue is empty");
        return queue[0];
    }

    private boolean isEmpty() {
        return end == 0;
    }

    private boolean isFull() {
        return end == queue.length;
    }
}
