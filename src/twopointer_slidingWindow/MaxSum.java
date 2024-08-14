package twopointer_slidingWindow;
// find the max sum of subarray of size k
public class MaxSum {
    public static void main(String[] args) {
        int[] arr = {2,4,1,5,2,8,0,3};
        int k = 3;//subarray
        int max = -1;
        int curr = 0;
        for(int i=0;i<k;i++){
            curr+=arr[i];
        }
        if(curr>max) max = curr;
        for(int i = k;i<arr.length;i++){
            curr = curr+arr[i]-arr[i-k];
            if(curr > max) max = curr;
        }
        System.out.println("max is "+max);

    }
}
