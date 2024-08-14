package stack;

public class CircularQueue {

    static int[] queue;
    static int front =0;
    static int end = 0;
    static int size ;
    static final int DEFAULT_SIZE = 10;

    public CircularQueue() {
        queue = new int[DEFAULT_SIZE];

    }
    public CircularQueue(int s) {
        queue = new int[s];
    }

    public boolean insert(int value) throws Exception {
        if(isFull()){
            throw new Exception("Queue if full");
        }
        queue[end++] = value;
        end = end % queue.length;
        size++;
        return true;
    }
    public int remove() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is empty you cant delete");
        }
        int removed = queue[front++];
        front = front % queue.length;
        size--;
        return removed;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("empty");
            return;
        }
        int i = front;
        do{
            System.out.print(queue[i++]+"->");
            i %= queue.length;

        }while(i != end);
        System.out.println();
    }
    public int peek() throws Exception {
        if(isEmpty()) throw new Exception("Queue is empty");
        return queue[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == queue.length;
    }
}
