package stack.Questions;

import java.util.Arrays;

public class GameStacks {
    public static void main(String[] args) {
        int k = 10;
//        remove the max elements such that sum should less than k
        int[] a= {4,2,4,6,1};
        int[] b = {2,1,8,5};
        int sum =0;
        int count =0;
        int result = TwoStacks(k,a,b,sum,count)-1;
        System.out.println(" result is "+result);


    }

    private static int TwoStacks(int k, int[] a, int[] b, int sum, int count) {
        if (sum > k) {
            return count;
        }
        if(a.length == 0 || b.length == 0) return count;
        int ans1 = TwoStacks(k, Arrays.copyOfRange(a,1,a.length),b,sum+a[0],count+1);
        int ans2 = TwoStacks(k, a,Arrays.copyOfRange(b,1,b.length),sum+b[0],count+1);

        return Math.max(ans1 , ans2);
    }

}
