package Interfaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        A a = new A(20);
        A ar[] = new A[a.rol];

        ar[0]=new A(10);
        System.out.println(ar[0].rol);

        a.fun1();

//        Example Without Generics (Raw Type)
//        ArrayList aa = new ArrayList();
//        aa.add(10);
//        aa.add("chena");
//        System.out.println(aa);

        NiceCar car = new NiceCar();
        car.startPlayer();
        car.startEngine();


    }
    static class A implements Interface1{
        int rol;
        public A(int rol)
        {
            this.rol = rol;
        }


        @Override
        public void fun() {

        }

    }
}
