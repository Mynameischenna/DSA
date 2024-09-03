package backtracking;

import java.util.ArrayList;
import java.util.List;

// generate all possible substrings of given string
public class GenerateSubStrings {
    public static void main(String[] args) {
        String s = "abc";
        subStrings(s,0,new StringBuilder());
        System.out.println(lis);
    }
    static List<String> lis = new ArrayList<>();
    private static void subStrings(String s, int i,StringBuilder sb) {
        if(i == s.length()){
            lis.add(String.valueOf(sb));
            return;
        }

        // take it
        sb.append(s.charAt(i));
        subStrings(s,i+1,sb);

        // remove it
        sb.deleteCharAt(sb.length()-1);
        subStrings(s,i+1,sb);
    }
}
