package stack;

public class Main {
    public static void main(String[] args) throws Exception {
//        CustomeStack<Integer> stack = new CustomeStack(5);
        CustomeStack<Integer> stack = new DynamicStack<>(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(150);
        try{
            System.out.println(stack.pop());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        stack.push(40);
        stack.push(150);
        System.out.println(stack);


    }
}
