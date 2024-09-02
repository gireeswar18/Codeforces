package codeforces;

import java.util.Scanner;

public class OddDivisor_1475A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {
            long num = sc.nextLong();

            if (num % 2 == 1) {
                System.out.println("YES");
                continue;
            }

            while (num % 2 != 1) {
                num = num / 2;
            }

            if (num == 1) {
                System.out.println("NO");
            }
            else
                System.out.println("YES");
        }
    }
}
