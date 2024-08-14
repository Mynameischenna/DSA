package CP;

import java.util.Scanner;

public class TooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String word = sc.next();
            if(word.length() > 10){
                word= word.charAt(0)+""+(word.length()-2)+word.charAt(word.length()-1);
            }
            System.out.println(word);
        }
    }

}
