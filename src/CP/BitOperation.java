package CP;

import java.util.Scanner;

public class BitOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int c = 0;
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            if (s.contains("-")) {
                c--;
            }
            if (s.contains("+")) {
                c++;
            }

        }
        System.out.println(c);
    }
}
