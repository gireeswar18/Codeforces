package codeforces;

import java.util.Scanner;

public class HolidayOfEquality_758A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int citizen = sc.nextInt();

        int[] arr = new int[citizen];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < citizen; i++) {
            arr[i] = sc.nextInt();
            max = Math.max(arr[i], max);
        }

        int minToSpend = 0;

        for (int curr : arr)
            minToSpend += max - curr;

        System.out.println(minToSpend);
    }
}
