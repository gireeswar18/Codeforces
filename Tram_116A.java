package codeforces;

import java.util.Scanner;

public class Tram_116A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int res = 0;
        int total = 0;

        for (int i = 0; i < n; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();

            total -= a;
            total += b;

            res = Math.max(res, total);

        }

        System.out.println(res);
    }
}
