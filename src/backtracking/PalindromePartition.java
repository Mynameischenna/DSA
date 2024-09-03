package backtracking;

import java.util.*;

public class PalindromePartition {
    public static void main(String[] args) {
        List<List<String>> ans = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        String s = "aab";
        helper(s, 0,ans,temp);
        System.out.println(ans);
    }
    static void helper(String s, int ind, List<List<String>> ans, List<String> temp) {
       if(ind == s.length()){
          ans.add(new ArrayList<>(temp));
          return;
       }
        for (int i = ind; i < s.length(); i++) {
           if(isPalindrome(s,ind,i)){
               String snippet = s.substring(ind,i+1);
               temp.add(snippet);
               helper(s,i+1,ans,temp);
               temp.removeLast();
           }

        }
    }

    private static boolean isPalindrome(String temp,int start,int end) {
        int i = start;
        int j = end;
        while (i < j) {
            if (temp.charAt(i) != temp.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
