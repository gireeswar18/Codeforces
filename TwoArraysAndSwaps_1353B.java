package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class TwoArraysAndSwaps_1353B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {

            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] arr1 = new int[n];
            int[] arr2 = new int[n];

            for (int i = 0; i < n; i++)
                arr1[i] = sc.nextInt();

            for (int i = 0; i < n; i++)
                arr2[i] = sc.nextInt();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            int ind1 = 0;
            int ind2 = n - 1;

            while (k-- != 0 && arr1[ind1] < arr2[ind2]) {
                arr1[ind1++] = arr2[ind2--];
            }

            int sum = 0;

            for (int x : arr1)
                sum += x;

            System.out.println(sum);
        }
    }

}
