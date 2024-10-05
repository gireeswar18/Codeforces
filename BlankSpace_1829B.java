package codeforces;

import java.util.Scanner;

public class BlankSpace_1829B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {
            int n = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            int l = 0, r = 0;
            int res = Integer.MIN_VALUE;

            while (r < n) {

                if (arr[r] == 1) {
                    res = Math.max(res, r - l);
                    l = r + 1;
                }
                r++;
            }

            System.out.println(Math.max(res, r - l));
        }
    }
}
