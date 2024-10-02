package codeforces;

import java.util.Scanner;

public class MaximumIncrease_702A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int st = 0;
        int res = -1;

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for (int i = 0; i < n; i++) {

            if (i - 1 != -1 && arr[i] <= arr[i - 1])
                st = i;

            res = Math.max(res, i - st + 1);

        }

        System.out.println(res);
    }
}
