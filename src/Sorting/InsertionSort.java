package Sorting;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {7,3,1,8,5,-1};
        insertionSort(arr);
        ArrayList<Integer> lis = new ArrayList<>();
        lis.add(2);
        System.out.println(lis.contains(2));
        System.out.println("insertion sort"+ Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        for(int i=1;i<arr.length;i++){
            int k=i;
            while(k>0){
                if(arr[k]<arr[k-1]){
                    //swap
                    int temp=arr[k];
                    arr[k]=arr[k-1];
                    arr[k-1]=temp;
                }
                k--;
            }
        }
    }
}
