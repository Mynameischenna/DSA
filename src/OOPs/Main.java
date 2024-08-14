package OOPs;

public class Main {
    public static void main(String[] args) {
        // here three reference variable pointing to only one object
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();
        A a = new A(10);
        System.out.println("age is "+a.age);
        A.fun();
    }

}
class A{
    int age;
    A(int age){
        this.age = age;
    }
    static void fun(){
        System.out.println(" i am in the fun");
    }

}