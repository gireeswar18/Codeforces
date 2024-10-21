package codeforces;

import java.util.Scanner;

public class YogurtSale_1955A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int n = sc.nextInt();
            int one = sc.nextInt();
            int two = sc.nextInt();

            int usingOne = n * one;
            int usingTwo = (n / 2) * two + (n % 2 == 1 ? one : 0);

            System.out.println(Math.min(usingOne, usingTwo));
        }
    }
}
