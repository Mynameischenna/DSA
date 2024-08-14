package Generics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // here we are creating custom array list
        CustomeArrayList list = new CustomeArrayList();
//        for (int i = 0; i < 14; i++) {
//            list.add(2 * i);
//        }
        list.add(21);
//        list.add("chnna"); // we got error here
        // see here you knew the problem its only works for integer type values , but java arraylist works with any type them how can we do that
        //we can do this by generics
        System.out.println(list.get(1));
        System.out.println(list.remove());
        list.set(2,12);
        System.out.println(list);

        // comparing objects
        ComparableObjects c1 = new ComparableObjects(96,"chenna");
        ComparableObjects c2 = new ComparableObjects(91,"Kiran");
        ComparableObjects[] arr = {c1,c2};
        Arrays.sort(arr);
//
        for(ComparableObjects c: arr){
            System.out.println("marks is "+c.marks);
        }
        if(c1.compareTo(c2) < 0 ){
            System.out.println(" c2 has greater marks than c1");
        }
        else  System.out.println(" c1 has greater marks than c2");
    }
}
