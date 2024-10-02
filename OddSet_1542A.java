package codeforces;

import java.util.Scanner;

public class OddSet_1542A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {
            int num = sc.nextInt();
            int even = 0;
            int odd = 0;

            for (int i = 0; i < num * 2; i++) {
                int n = sc.nextInt();
                if (n % 2 == 0)
                    even++;
                else
                    odd++;
            }

            System.out.println((even == odd) ? "YES" : "NO");
        }
    }
}
