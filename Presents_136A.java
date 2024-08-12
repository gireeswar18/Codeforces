package codeforces;

import java.util.Scanner;

public class Presents_136A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int[] res = new int[n];
        for (int i = 0; i < n; i++) {

            res[arr[i] - 1] = i + 1;

        }

        for (int num : res)
            System.out.print(num + " ");
    }
}
