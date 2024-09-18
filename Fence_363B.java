package codeforces;

import java.util.Scanner;

public class Fence_363B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] height = new int[n];

        for (int i = 0; i < n; i++)
            height[i] = sc.nextInt();

        int left = 0;
        int right = 0;

        int sum = 0;
        int resInd = 0;

        for (int i = left; i < k; i++) {
            sum += height[right++];
        }

        int min = sum;

        while (right < n) {

            sum -= height[left++];
            sum += height[right++];

            if (min > sum) {
                min = sum;
                resInd = left;
            }
        }

        System.out.println(resInd + 1);
    }
}
