package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class HonestCoach_1360B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {

            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            Arrays.sort(arr);

            int res = Integer.MAX_VALUE;

            for (int i = 1; i < n; i++)
                res = Math.min(res, arr[i] - arr[i - 1]);

            System.out.println(res);
        }
    }
}
