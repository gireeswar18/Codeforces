package codeforces;

import java.util.Scanner;

public class OrdinaryNumbers_1520B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        while (test-- != 0) {
            int n = sc.nextInt();
            int res = 0;

            for (int d = 1; d <= 9; d++) {
                long num = d;
                while (num <= n) {
                    res++;
                    num = num * 10 + d;
                }
            }

            System.out.println(res);
        }
    }
}
