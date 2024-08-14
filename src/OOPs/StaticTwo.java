package OOPs;

public class StaticTwo {
    public static void main(String[] args) {
        rambo r = new rambo();
        r.fun1(2);
        r.fun2(10);
    }
}
class rambo{
    int age;
    int roll;
    static {
        System.out.println(":from static blcok");
    }
    void fun1(int rol){
        this.roll=rol;
        System.out.println("from fun1");
    }
    static void fun2(int age){
        // you cannot access non-static members from static methods
//        this.age = age;
        System.out.println("from fun2");
    }
}