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
            int buy;
            if (one * 2 < two) {
                buy = one;
            }
            else {
                buy = two;
            }

            if (n % 2 == 0) {
                if (buy == one) {
                    System.out.println(buy * n);
                }
                else {
                    System.out.println((n / 2) * buy);
                }
            }
            else {
                if (buy == one) {
                    System.out.println(buy * n);
                }
                else {
                    System.out.println((n / 2) * buy + one);
                }
            }
        }
    }
}
