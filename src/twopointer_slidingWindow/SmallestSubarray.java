package twopointer_slidingWindow;
// smallest subarray of sum>= k
public class SmallestSubarray {
    public static void main(String[] args) {
        int[] arr = {2,4,1,5,2,8,0,3};
        int targetSum = 8;
        int sum = 0;
        int size = Integer.MAX_VALUE;
        int start =0;
        for(int i=0;i<arr.length;i++){
            if(size == 1) break;
            sum += arr[i];
            while(sum >= 8){
                size = Math.min(size,i-start+1);
                sum-= arr[start];
                start++;
            }
        }
        System.out.println(size);
    }
}
