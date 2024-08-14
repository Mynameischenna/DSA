package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {2,1,6,4,3,6,9,4};
//        insertSort(arr);
        selectionSort(arr);
        System.out.println("after sorting "+ Arrays.toString(arr));
    }
    static void selectionSort(int[] arr){
        // finding small element
        for(int i=0;i<arr.length-1;i++){
            int minIndex=i;
            for(int k=i;k<arr.length;k++){
                if(arr[k]<arr[i]) minIndex=k;
            }
            // swap min value with starting index
            int temp=arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] =temp;
        }

    }

    private static void insertSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            int max=0;
            for(int k=0;k<arr.length-i;k++){
                if(arr[k]>=arr[max]) max=k;
            }
            // swap
            int temp=arr[arr.length-1-i];
            arr[arr.length-1-i]=arr[max];
            arr[max]= temp;
        }
    }
}
