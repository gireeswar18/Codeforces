package codeforces;

import java.util.Scanner;

public class EqualCandies_1676B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {
            int size = sc.nextInt();

            int[] arr = new int[size];
            int min = Integer.MAX_VALUE;

            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();

                 min = Math.min(min, arr[i]);
            }

            int total = 0;

            for (int num : arr)
                total += num - min;

            System.out.println(total);
        }
    }
}
