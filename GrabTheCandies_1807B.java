package codeforces;

import java.util.Scanner;

public class GrabTheCandies_1807B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int n = sc.nextInt();

            int evenSum = 0, oddSum = 0;

            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();

                if (num % 2 == 0) {
                    evenSum += num;
                }
                else {
                    oddSum += num;
                }
            }

            System.out.println(evenSum > oddSum ? "YES" : "NO");
        }
    }
}
