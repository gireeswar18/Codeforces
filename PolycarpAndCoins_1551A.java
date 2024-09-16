package codeforces;

import java.util.Scanner;

public class PolycarpAndCoins_1551A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {

            long n = sc.nextLong();

            long rem = n % 3;

            if (rem == 1)
                System.out.println((n / 3 + 1) + " " + (n / 3));

            else if (rem == 2)
                System.out.println((n / 3) + " " + ((n / 3) + 1));

            else
                System.out.println((n / 3) + " " + (n / 3));

        }
    }
}
