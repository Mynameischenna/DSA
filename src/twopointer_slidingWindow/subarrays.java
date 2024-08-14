package twopointer_slidingWindow;

import java.util.Arrays;

public class subarrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        subarray(arr);

    }
    public static void subarray(int[] arr){
        for(int i=0;i<arr.length;i++){
            int[] temp = new int[3];
            for(int j =i;j<arr.length;j++){
                temp[j] = arr[j];
                System.out.println(Arrays.toString(temp));
            }

        }
    }
}
