package Polymorphism;

public class Circle extends Shape {

    void fun(){
        System.out.println("hey boss 1");
    }
    // late binding
    @Override
    void area() {
        System.out.println("Circle area");
    }
}
