package Interfaces.defaultStatic;

public class Main implements A,B{
    public static void main(String[] args) {
        Main main = new Main();
        // even if you have the same static fun names it does not create a problem
        A.fun();
        B.fun();
        main.fun2();
    }

    @Override
    public void fun2() {
        B.super.fun2();
    }
}
