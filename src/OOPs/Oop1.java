package OOPs;

public class Oop1 {
    public static void main(String[] args) {
       Student s1 = new Student();
        System.out.println(s1);

        A a;
        // same reference variable name cannt to point to different objects
        for(int i=0;i<1000000000;i+=0.1){
            a=new A(10);
        }
    }
    static class Student{
        int rollno;
        String name;
        float marks;

        Student(){
            System.out.println("hello constructor");
        }

    }

    static class A implements  AutoCloseable{
        int a;
        A(int a){
            this.a=a;
        }

        @Override
        public void close() {
            // Cleanup code
            System.out.println("close method called");
        }
    }
}
