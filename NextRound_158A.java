package codeforces;

import java.util.Scanner;

public class NextRound_158A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int val = arr[k - 1];
        int count = 0;

        for (int num : arr) {

            if (num >= val && num != 0)
                count++;
            else
                break;

        }

        System.out.println(count);
    }
}
