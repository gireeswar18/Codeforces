package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class IlyaAndQueries_313B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char[] arr = str.toCharArray();
        int n = sc.nextInt();

        int[] dp = new int[arr.length];
        dp[0] = 0;

        for (int i = 1; i < arr.length; i++) {
            dp[i] = dp[i - 1];
            if (arr[i] == arr[i - 1])
                dp[i]++;
        }

//        System.out.println(Arrays.toString(dp));

        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();

            System.out.println(dp[r - 1] - dp[l - 1]);
        }
    }

}
