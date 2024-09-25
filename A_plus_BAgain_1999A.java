package codeforces;

import java.util.Scanner;

public class A_plus_BAgain_1999A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {

            int n = sc.nextInt();

            int sum = 0;
            while (n != 0) {
                sum += n % 10;
                n /= 10;
            }

            System.out.println(sum);
        }
    }
}
