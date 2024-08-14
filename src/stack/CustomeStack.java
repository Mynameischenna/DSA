package stack;

import java.util.Arrays;

public class CustomeStack<E> {
    public static Object[] stack;
    private static final int DEFAULT_SIZE = 10;
    private static int size ;
    private static int pointer = -1;
    public CustomeStack(){
        this(DEFAULT_SIZE);
    }
    public CustomeStack(int s) {
        size = s;
        this.stack = new Object[size];
    }

    public boolean push(E value){
        if(isFull()){
            System.out.println("stack is full you can not add");
            return false;
        }
        stack[++pointer] = value;
        return true;
    }

    public boolean isFull() {
        return pointer == stack.length-1;
    }
    public boolean isEmpty(){
        return pointer == -1;
    }

    @Override
    public String toString() {
        return "CustomeStack{" +
                "stack=" + Arrays.toString(stack) +
                '}';
    }

    public E pop() throws Exception {
        if(isEmpty()){
            throw  new Exception("can not delete from empty stack");
        }
        E poppedItem = (E)stack[pointer];
        pointer--;
        return poppedItem;
    }
}
