package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Twins_160A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int total = 0;
        int coins = 0;
        int myAmount = 0;

        for (int num : arr)
            total += num;

        for (int i = n - 1; i >= 0; i--) {

            myAmount += arr[i];
            total -= arr[i];
            coins++;
            if (myAmount > total)
                break;
        }

        System.out.println(coins);
    }
}
