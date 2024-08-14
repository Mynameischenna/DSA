package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {1,6,3,9,5,6};
        bubbleSort(arr);
        System.out.println("after sorting "+ Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        int i=0;
        while(i<arr.length){
            int k=0;
            while(k<arr.length-1-i) {
                if (arr[k] > arr[k + 1]) {
                    // swap
                    int temp = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k + 1] = temp;
                }
                k++;
            }
            i++;
        }
    }
}
