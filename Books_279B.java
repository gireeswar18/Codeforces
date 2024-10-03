package codeforces;

import java.util.Scanner;

public class Books_279B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int left = 0, right = 0;
        int res = 0;

        while (right < n) {

            t -= arr[right];

            while (t < 0 && left < n) {
                res = Math.max(res, right - left);
                t += arr[left];
                left++;
            }

            right++;
        }

        res = Math.max(res, right - left);

        System.out.println(res);
    }
}
