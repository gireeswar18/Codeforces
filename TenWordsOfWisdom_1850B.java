package codeforces;

import java.util.Scanner;

public class TenWordsOfWisdom_1850B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int n = sc.nextInt();
            int max = 0;
            int winner = 0;

            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();

                if (a <= 10 && b > max) {
                    max = b;
                    winner = i + 1;
                }
            }

            System.out.println(winner);
        }
    }
}
