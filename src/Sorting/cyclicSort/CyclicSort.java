package Sorting.cyclicSort;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int arr[] = {0,2,4,1,3};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
//    public static  void cyclicSort(int[] arr){
//        int i=0;
//        while(i<arr.length){
//            int valueIndex = arr[i]-1;
//            if(valueIndex != i){
//                // swap
//                int temp = arr[valueIndex];
//                arr[valueIndex] = arr[i];
//                arr[i] = temp;
//            }
//            else{
//                i++;
//            }
//
//        }

        // if starts from 0
        public static  void cyclicSort(int[] arr){
            int i=0;
            while(i<arr.length){
                int valueIndex = arr[i];
                if(valueIndex != i){
                    // swap
                    int temp = arr[valueIndex];
                    arr[valueIndex] = arr[i];
                    arr[i] = temp;
                }
                else{
                    i++;
                }

            }
    }
}
