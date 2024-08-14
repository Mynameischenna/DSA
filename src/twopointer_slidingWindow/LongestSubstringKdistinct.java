package twopointer_slidingWindow;

import java.util.HashMap;

public class LongestSubstringKdistinct {
    public static void main(String[] args) {
//       substring();
       String s = "aaabbb";
       int k = 3;
        System.out.println("max size is "+longest(s,k));
    }
    public static void substring(){
        String s = "AAAAHHEFHSSSSSS";
        int k = 2;
        int windowStart = 0;
        int size = Integer.MIN_VALUE;
        HashMap<Character,Integer> characters = new HashMap<>();
        for (int windowsEnd = 0; windowsEnd < s.length(); windowsEnd++) {
            char rightChar = s.charAt(windowsEnd);
            characters.put(rightChar, characters.getOrDefault(rightChar, 0) + 1);

            while(characters.size() > k){
                char leftChar = s.charAt(windowStart);
                characters.put(leftChar, characters.get(leftChar) - 1);
                if (characters.get(leftChar) == 0) {

                    characters.remove(leftChar);
                }
                windowStart++;
            }
            size = Math.max(size , windowsEnd - windowStart + 1);
        }
        System.out.println(size);
    }
     static int longest(String s,int k){
        HashMap<Character,Integer> map = new HashMap();
        for (int windowsEnd = 0; windowsEnd < s.length(); windowsEnd++) {
            char rightChar = s.charAt(windowsEnd);
            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);
        }
        for (char c :map.keySet()){
            if(map.get(c) < k){
                map.remove(c);
            }
        }
        int curr = 0;
        int size = Integer.MIN_VALUE;
         for (int i = 0; i < s.length(); i++) {
             if(map.containsKey(s.charAt(i))){
                 curr++;
             }
             else{
                 size = Math.max(size,curr);
                 curr =0;
             }
             size = Math.max(size,curr);
         }
        System.out.println("map is "+map);
        return size;

        }
}
