package codeforces;

import java.util.Scanner;

public class MaximumMultiplySum_1985B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {

            int n = sc.nextInt();
            int res = -1;
            int max = Integer.MIN_VALUE;

            for (int i = 2; i <= n; i++) {
                int sum = (n / i) * (i + (n / i) * i);

                if (sum > max) {
                    max = sum;
                    res = i;
                }
            }

            System.out.println(res);

        }
    }
}
