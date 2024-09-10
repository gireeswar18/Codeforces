package codeforces;

import java.util.Scanner;

public class RequiredRemainder_1374A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            long n = sc.nextLong();

            long k = (n - y) / x * x + y;

            if (k > n)
                k -= x;

            System.out.println(k);
        }

    }
}
