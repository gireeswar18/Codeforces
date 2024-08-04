//package codeforces;

import java.util.Scanner;

public class KefaAndFirstSteps_580A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int prev = 0;
        int maxLen = 0;
        int len = 0;

        for (int num : arr)
        {
            if (num >= prev)
            {
                len++;
            }
            else
            {
                maxLen = Math.max(len, maxLen);
                len = 1;
            }
            prev = num;
        }

        maxLen = Math.max(len, maxLen);

        System.out.println(maxLen);
    }
}
