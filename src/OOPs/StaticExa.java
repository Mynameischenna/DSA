package OOPs;

//import static OOPs.StaticExa.A;

public class StaticExa {
    public static void main(String[] args) {
        int ageMian = 20;
        StaticExa ex = new StaticExa();
        // non static members can be accessed only with instances
        A.fun2();
        A a = new A(10,23);

//        System.out.println(i);
//        System.out.println(a.i);
        a.ful();
    }
   static class  A{
        int nam=0;
        static  int i=0;

        A(int nam, int i){
            this.nam=nam;
            A.i=i;
            System.out.println("hello");
        }
        void ful(){
            System.out.println(i+" "+nam);

        }

        static void fun2(){
            System.out.println("hello i am fun 2");
        }

    }
}
