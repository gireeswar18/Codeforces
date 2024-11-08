package codeforces;

import java.util.Scanner;

public class FavoriteSequence_1462A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int n = sc.nextInt();
            int[] res = new int[n];

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            int i = 0, j = n - 1;

            for (int k = 0; k < n; k += 2) {
                res[k] = arr[i];
                if (k + 1 < n)
                    res[k + 1] = arr[j];
                i++;
                j--;
            }

            for (int num : res) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
