package backtracking;

import java.util.*;

class SubSetsWithDups {
    static List<List<Integer>> list = new ArrayList<>();
    public static List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums); // Step 1: Sort the array to handle duplicates
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }

    private static  void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int start) {
        list.add(new ArrayList<>(tempList)); // Step 3: Add the current subset to the result list
        System.out.println("list "+start+" "+list);
        for (int i = start; i < nums.length; i++) { // Loop through each element starting from 'start'
            if (i > start && nums[i] == nums[i - 1]) continue; // Step 6: Skip duplicates
            tempList.add(nums[i]); // Include nums[i] in the current subset
            System.out.println("before "+tempList);
            backtrack(list, tempList, nums, i + 1); // Recurse with the next element

            tempList.remove(tempList.size() - 1); // Step 4: Backtrack by removing the last added element
            System.out.println("after "+tempList);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2};
        subsetsWithDup(arr);
        System.out.println(list);
    }
}
