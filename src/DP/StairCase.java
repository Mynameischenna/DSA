package DP;

public class StairCase {
    public static void main(String[] args) {
        // you have ladder oof size 5 , at each time you either jumb to 1 case or 2 ,find out the number of different ways you can climmb the ladder
         int n = 3;
         helper(n);
        System.out.println("nof of ways "+count);
    }
    static int count =0;
    static void helper(int n){
        if(n == 0){
            count++;
            return;
        }
        // take on step
        if(n-1 >= 0)
            helper(n-1);
        if(n-2 >= 0)
            helper(n-2);
    }
}
