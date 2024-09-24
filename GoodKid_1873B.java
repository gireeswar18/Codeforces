package codeforces;

import java.util.Scanner;

public class GoodKid_1873B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {
            int n = sc.nextInt();
            int min = 10;
            int minInd = -1;

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();

                if (arr[i] < min) {
                    min = arr[i];
                    minInd = i;
                }
            }

            int product = 1;
            arr[minInd]++;

            for (int num : arr)
                product *= num;

            System.out.println(product);
        }
    }
}
