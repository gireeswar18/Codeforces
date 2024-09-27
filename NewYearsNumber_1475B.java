package codeforces;

import java.util.Scanner;

public class NewYearsNumber_1475B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {
            int n = sc.nextInt();

            if (n < 2020) {
                System.out.println("NO");
                continue;
            }

            int q = n / 2020;
            int r = n % 2020;

            if (r <= q)
                System.out.println("YES");
            else
                System.out.println("NO");

        }
    }
}
