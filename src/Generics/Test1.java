package Generics;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//<? extends Foo> upper bound
public class Test1<T extends  Number> {
//    ArrayList
//    T[] arr = new T[5];
    Object arr[] ={2,3,4,"chenna"};
    T size ;
    T get(int index) throws FileNotFoundException {
        T res;
        if(index < arr.length && index >=0){
            res = (T)arr[index];
        }
        else{
            throw new FileNotFoundException("In valid Index..");
        }

        return res;
    }


//    arr[0]=20;

//    private T obj ;
//    public void set(T obj) {
//        this.obj = obj;
//    }
//    public T get() {
//        return this.obj;
//    }
//    public static void main(String[] args) {
//        Test1<Integer> one = new Test1();
//        one.set(12);
//        int b =  one.get(); // here you will get runtime errors which are difficult tp solve so here comes generics
//
//        ArrayList<Integer> list = new ArrayList();
//        list.add(10);
//        list.add(21);
//        ArrayList<String> list2 = new ArrayList();
//        list2.add("chena");
//        add(list);
//        System.out.println("ke dk");
//        add(list2);
        public static void fun(Integer[] arr){
//            System.out.println(age);
        }

        public static void main(String[] args) {
        Test1<Integer> test= new Test1<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
            System.out.println(("size is "+test.size(list)));
        try{
//            Double s = test.get(5)*1.0;
//            System.out.println("the valeu is "+s);
        }catch(ArithmeticException e){
            System.out.println(e);
        }


//        Test1<Integer> ne = new Test1<>();
//        Integer arr[]= {1,2,3};
//
//            System.out.println( Arrays.toString(arr));

        }

    private int size(ArrayList<?> list) {
        int count  =0;
        for(Object obj : list){
            count++;
        }
        return count;
    }
}
    // unbound type does not depend on type parameter
//    public static void add(ArrayList<?> list){
//        for(Object i : list){
//            System.out.println(i);
//        }
//    }
//}
