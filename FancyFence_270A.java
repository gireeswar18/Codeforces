package codeforces;

import java.util.Scanner;

public class FancyFence_270A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {
            int d = sc.nextInt();

            int num = (180 % d == 0) ? 1 : d;
            int den = (180 % d == 0) ? 180 / d : 180;

            int ln = num;
            int rn = den;
            int two = den * 2;

            int left = two;
            int right = rn - ln;

            if (left % right == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}