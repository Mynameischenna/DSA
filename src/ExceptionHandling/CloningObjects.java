package ExceptionHandling;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CloningObjects implements Cloneable{

    @Override
    public CloningObjects clone() throws AssertionError{
        try {
            return (CloningObjects) super.clone();
        }catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
    int age;
    String s;
    int[] arr;

    public CloningObjects(int age, String s) {
        this.age = age;
        this.s = s;
        this.arr = new int[5];

    }

    public static void main(String[] args) {
        CloningObjects c1 = new CloningObjects(10,"chenn");
        CloningObjects c2 = c1.clone();
        c1.arr[1] = 12;
//        c1.s = "rambo";
        c2.arr[0] = 24;
        System.out.println(c2.s);
        System.out.println(Arrays.toString(c1.arr));
        System.out.println(Arrays.toString(c2.arr));




    }
}
