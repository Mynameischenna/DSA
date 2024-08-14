package Interfaces.defaultStatic;

public class Class implements A, B{
    @Override
    public void fun2() {
        A.super.fun2();
    }
}
