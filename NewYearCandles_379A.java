package codeforces;

import java.util.Scanner;

public class NewYearCandles_379A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = a;

        while (a >= b) {
           if (a % b == 0) {
               a = a / b;
               res += a;
           }
           else {
               int rem = a % b;
                a /= b;
                res += a;
                a += rem;
           }
        }

        System.out.println(res);
    }
}
