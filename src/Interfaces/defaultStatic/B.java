package Interfaces.defaultStatic;

public interface B {
    static void fun(){
        System.out.println("i am from fun b");
    }
    default  void fun2(){
        System.out.println(" from b");
    }
}
