package Abstraction;

public class Child1 extends Parent{
    int age;
    Child1(int age, String name , int eyes) {
        super(age, name , eyes);
    }


    @Override
    void greeting() {
        System.out.println(" greeting from child 1");
    }

}
