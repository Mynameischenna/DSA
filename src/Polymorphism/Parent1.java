package Polymorphism;

// Parent class
class ParentClass {
    void display() {
        System.out.println("Display method in ParentClass");
    }
    static void demo(){
        System.out.println("demo 1");
    }
}

// Child class extending ParentClass
class ChildClass extends ParentClass {
    @Override
    void display() {
        System.out.println("Display method in ChildClass");
    }

    void someMethod() {
        display(); // Calls ChildClass's display() method
    }
}

public class Parent1 {
    public static void main(String[] args) {
        ParentClass obj1 = new ParentClass(); // ParentClass reference
        ParentClass obj2 = new ChildClass();  // ChildClass object, ParentClass reference

        obj1.display(); // Calls ParentClass's display() method
        obj2.display(); // Calls ChildClass's display() method due to dynamic dispatch
    }
}

