package codeforces;

import java.util.Scanner;

public class CanISquare_1915C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int n = sc.nextInt();
            long total = 0;
            for (int i = 0; i < n; i++) {
                total += sc.nextInt();
            }

            long sqrt = (long) Math.sqrt(total);

            if (sqrt * sqrt == total)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
