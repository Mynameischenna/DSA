package Polymorphism;

public class MethodOverloading {
    public static void main(String[] args) {
//        circle object has access to which needs to e invoked also know as dynamic method dispatch / late binding / upcasting / runtime polymorphism .
    Shape shape = new Circle();
    shape.volume();
    shape.area();
    shape.fun();

    Shape s = new Shape();
    int c1 = s.add(2,3);// this is known as compile time polymorphism // method overloading // same method name but different paremeter , no of parameters , different orderr of paremeters ,return types can be same
    int c2 = s.add(2,4,5);//The return type of the methods can be the same or different, but it does not contribute to method overloading.
        System.out.println("sum is "+c1+ " "+c2);
    }
}
