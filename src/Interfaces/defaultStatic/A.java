package Interfaces.defaultStatic;

public interface A {
    static void fun(){
        System.out.println("i am in in interface A");
    }
    default void fun2(){
        System.out.println("default from a ");
    }
}
