package CP;

import java.util.Scanner;

public class TheaterSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] numbers = s.split(" ");

        // Correctly parsing integers from the input
        int n = Integer.parseInt(numbers[0]);
        int m = Integer.parseInt(numbers[1]);
        int a = Integer.parseInt(numbers[2]);

        // Calculating the required number of tiles for both dimensions
        long ans = (long) Math.ceil((double) n / a);
        long ans2 = (long) Math.ceil((double) m / a);

        // The result should be a long type since the number of tiles can be very large
        long totalTiles = ans * ans2;

        System.out.println(totalTiles);
    }
}
