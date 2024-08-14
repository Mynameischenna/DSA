package Interfaces;

public interface Interface1 {
    //  it can have only method body
    public void fun();
    default  void fun1(){
        System.out.println(" hey i am in default method");
    }
     static void fun3(){
         System.out.println(" i am in static method");
     }
}
