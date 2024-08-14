package stack;

public class DynamicCircularQueue extends CircularQueue{

    public DynamicCircularQueue() {
        super();

    }
    public DynamicCircularQueue(int s) {
        super(s);
    }

    @Override
    public boolean insert(int value) throws Exception {
        // what if stack is full ,just double it and copy elements
        if(isFull()){
            int[] temp = new int[queue.length * 2];
            for (int i = 0; i < queue.length; i++) {
                temp[i] = queue[(front+i)% queue.length];
            }
            front =0;
            end = queue.length;
            queue = temp;
        }
        return super.insert(value);
    }
}
