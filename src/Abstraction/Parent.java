package Abstraction;

public abstract class Parent {
    // abstract class contains both abstract and non-abstract methods (concrete methods)
    static int eyes;// this is a class level
    int age;
    String name;
    final int EYES;
    // default constructor, hence you cant create obj but you can assign variable from child class
    Parent(int age,String name, int eyes){
        this.age=age;
        this.name=name;
        Parent.eyes=21;
       EYES = 23; //this will work because in order use abstract u need to create object for that class right,
//                so least once this constructor will be called
        System.out.println(" parent constructor"+name);
    }
    static void fun2(){
        System.out.println(" i am from fun2");
    }
    abstract void greeting();
    void fun(){ // non-abstract methods
        System.out.println(" hey have fun");
    }
//    Parent p = new Parent(); // we cant create objects for abstract class
    // because we have some un implements are there so we cant.
}
