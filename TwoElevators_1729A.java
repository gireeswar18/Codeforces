package codeforces;

import java.util.Scanner;

public class TwoElevators_1729A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int e1 = Math.abs(a - 1);
            int e2 = Math.abs(b - c) + Math.abs(c - 1);

            if (e1 < e2) {
                System.out.println(1);
            }
            else if (e1 > e2) {
                System.out.println(2);
            }
            else {
                System.out.println(3);
            }
        }
    }
}
