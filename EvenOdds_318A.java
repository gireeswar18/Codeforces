package codeforces;

import java.util.Scanner;

public class EvenOdds_318A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long term = sc.nextLong();

        if (n % 2 == 0) {

            if (term <= n / 2) {
                System.out.println(1 + (term - 1) * 2);
            }
            else {
                System.out.println(2 + (term - (n / 2) - 1) * 2);
            }

        }
        else {
            if (term <= n / 2 + 1) {
                System.out.println(1 + (term - 1) * 2);
            }
            else {
                System.out.println(2 + (term - (n / 2 + 1) - 1) * 2);
            }
        }
    }
}
