package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,1};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    private static int[] mergeSort(int[] arr) {
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length /2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);

    }

    private static int[] merge(int[] left, int[] right) {
        int[] mix = new int[left.length + right.length];
        int lIndex = 0;
        int rIndex = 0;
        int mIndex = 0;

        while(lIndex < left.length && rIndex < right.length){
            if(left[lIndex] <= right[rIndex]){
                mix[mIndex] = left[lIndex];
                lIndex++;
            }
            else{
                mix[mIndex] = right[rIndex];
                rIndex++;
            }
            mIndex++;
        }

        while(lIndex < left.length){
            mix[mIndex] = left[lIndex];
            lIndex++;
            mIndex++;

        }
        while(rIndex < right.length){
            mix[mIndex] = right[rIndex];
            rIndex++;
            mIndex++;

        }
        return mix;

    }
}
