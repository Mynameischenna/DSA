package Polymorphism;

public class Shape {

    void fun(){
        System.out.println("heu fun11");
    }

    void area(){
        System.out.println(" iam in shape");
    }
    void volume(){
        System.out.println("volume is");
    }

    int add(int a , int b){
        return a+b;
    }
    int add(int a , int b, int c){
        return a+b+c;
    }
}
