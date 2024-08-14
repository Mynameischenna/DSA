package stack;

public class DynamicStack<E> extends CustomeStack<E>{
    DynamicStack(){
        super();
    }
    DynamicStack(int size){
        super(size);
    }

    @Override
    public boolean push(E value) {
        // what if stack is full ,just double it and copy elements
        if(isFull()){
            Object[] temp = new Object[stack.length * 2];
            for (int i = 0; i < stack.length; i++) {
                temp[i] = stack[i];
            }
            stack = temp;
        }
        return super.push(value);
    }
}
