package CP;

import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        int c = 0;
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] numbers = s.split(" ");
            int local = 0;
            for (String number : numbers) {
                if(number.equals("1")) local++;
            }
            if(local >=2) c++;

        }
        System.out.println(c);
    }
}
