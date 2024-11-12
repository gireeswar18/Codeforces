package codeforces;

import java.util.Scanner;

public class PhoenixAndBalance_1348A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int n = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = 2 << i;
            }

            int a = 0, b = 0;

            int cnt = n / 2;

            for (int i = n - 2; i >= 0 && cnt != 0; i--) {
                a += arr[i];
                cnt--;
            }

            for (int i = 0; i < (n / 2) - 1; i++) {
                b += arr[i];
            }
            b += arr[n - 1];

            System.out.println(Math.abs(a - b));
        }
    }
}
