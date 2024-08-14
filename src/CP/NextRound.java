package CP;

import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);
        String[] nums = sc.nextLine().split(" ");
        int kthScore = Integer.parseInt(nums[k-1]);
        int score =0;
        for (int i = 0; i < nums.length ; i++) {
            int first = Integer.parseInt(nums[i]);
            if( first > 0 && first >= kthScore){
                score++;
            }}
        System.out.println(score);
        }
    }


