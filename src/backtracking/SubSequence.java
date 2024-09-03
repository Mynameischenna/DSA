package backtracking;

import java.util.ArrayList;
import java.util.List;

public class SubSequence {
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        int target = 3;
        subsqNoDups(0,arr,new ArrayList<>());
//        subsqSum(0,arr,new ArrayList<>(),target,0);
    }

    private static void subsq(int i, int[] arr, List<Integer> subse) {
        // base condtion
        if(i >= arr.length){
            System.out.println(subse);
            return;
        }
        // take current element
        subse.add(arr[i]);
        subsq(i+1,arr,subse);

        // not take it
        subse.removeLast();
        subsq(i+1,arr,subse);

    }
    private static void subsqNoDups(int i, int[] arr, List<Integer> subse) {
        // base condtion
        if(i >= arr.length){
            System.out.println(subse);
            return;
        }
        // take current element
        subse.add(arr[i]);
        subsqNoDups(i+1,arr,subse);

        // not take it
        subse.removeLast();
        //remove duplicates
        while(i+1 < arr.length && arr[i] == arr[i+1]){
            i++;
        }
        subsqNoDups(i+1,arr,subse);

    }
    private static boolean subsqSum(int i, int[] arr, List<Integer> subse,int target,int sum) {
        // base condtion
        if(i >= arr.length){
            if(sum == target){
                System.out.println(subse);
                return true;
            }
           return false;
        }
        // pruning
        if(sum > target) return false;

        // take current element
        subse.add(arr[i]);
        if(subsqSum(i+1,arr,subse,target,sum+arr[i])){
            return true;
        }

        // not take it
        int k = subse.removeLast();
        if(subsqSum(i+1,arr,subse,target,sum)){
            return true;
        }
        return false;
    }
}
