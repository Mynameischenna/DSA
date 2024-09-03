package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        // Arrays.sort(nums); // not necessary
//        backtrack(list, new ArrayList<>(), nums);
        List<Integer> lis = new ArrayList<>();
        for(int i : nums){
            lis.add(i);
        }
        return permutation(lis);
//        return list;
    }

    private static  void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums){
        if(tempList.size() == nums.length){
            list.add(new ArrayList<>(tempList));
        } else{
            for(int i = 0; i < nums.length; i++){
                if(tempList.contains(nums[i])) continue; // element already exists, skip
                tempList.add(nums[i]);
                backtrack(list, tempList, nums);
                tempList.remove(tempList.size() - 1);
                System.out.println("afyter" +tempList);
            }
        }
    }
    //neetcode solution
    static List<List<Integer>> permutation( List<Integer> nums){
        List<List<Integer>> result = new ArrayList<>();
        //base condition
        if(nums.size() == 1){
            result.add(new ArrayList<>(nums));
            return result;
        }

        for(int i=0;i<nums.size();i++){
            int n = nums.removeFirst();
            List<List<Integer>> perms = permutation(nums);

            for(List<Integer> perm : perms){
                perm.add(n);
                result.add(perm);
            }
            nums.add(n);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
//        List<List<Integer>> list = permute(nums);
//        for(List<Integer> ls : list){
//            System.out.println(ls);
//        }
        System.out.println("permmutation are "+permute(nums));
    }
}
