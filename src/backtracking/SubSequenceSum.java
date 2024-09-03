package backtracking;


// count the number of subsequences whose sum is k
public class SubSequenceSum {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 5;
        System.out.println(STR."count is \{helper(arr, 0, k, "")}");

    }
    static int helper(int[] arr,int i,int sum,String path){
        if(i == arr.length){
            if(sum == 0){
                System.out.println(path);
                return 1;
            }
            return 0;
        }
        int res = 0;
        if(sum - arr[i] >=0){
            res = helper(arr,i+1,sum-arr[i],path+arr[i]);
        }
        return res+helper(arr,i+1,sum,path);
    }

}



