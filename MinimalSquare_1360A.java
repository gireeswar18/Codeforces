package codeforces;

import java.util.Scanner;

public class MinimalSquare_1360A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {

            int a = sc.nextInt();
            int b = sc.nextInt();

            int max = Math.max(2 * Math.min(a , b), Math.max(a, b));

            System.out.println(max * max);
        }
    }
}
