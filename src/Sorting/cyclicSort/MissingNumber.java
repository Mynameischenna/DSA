package Sorting.cyclicSort;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        //find the missing number from numbers [0,n]
        int[] nums = {2,3,0,1};
        cyclicsort(nums);
        // find teh number
        System.out.println(Arrays.toString(nums));
        for(int i=0;i<nums.length;i++){
            if(nums[i] != i){
                System.out.println("missing number in array is "+i);
                return;
            }
        }
        System.out.println(nums.length);
    }
    static void cyclicsort(int[] arr){
        int i=0;
        while(i<arr.length){
            int valueindex = arr[i];
            if(valueindex < arr.length && valueindex != i){
                // swap
                int temp = arr[valueindex];
                arr[valueindex] = arr[i];
                arr[i] = temp;
            }
            else{
                i++;
            }
        }
    }
}
