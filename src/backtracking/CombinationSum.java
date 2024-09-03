package backtracking;

import Interfaces.defaultStatic.A;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5};
        int target = 5;

        helper(arr,0,new ArrayList<>(),target);
        System.out.println("no of combinations of sum is 5 "+ans);
    }
    static List<List<Integer>> ans = new ArrayList<>();
    static void helper(int[] arr, int i, List<Integer> lis,int target){
        if(i == arr.length){
            if(target == 0){
                ans.add(new ArrayList<>(lis));
            }
            return;
        }
        if(arr[i] <= target){
            lis.add(arr[i]);
            helper(arr,i,lis,target-arr[i]);
            lis.removeLast();

        }
        helper(arr,i+1,lis,target);
    }
}
