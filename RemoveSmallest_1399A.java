package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveSmallest_1399A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n-- != 0) {

            int size = sc.nextInt();

            int[] arr = new int[size];

            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            String res = "YES";

            for (int i = size - 1; i > 0; i--) {

                if (arr[i] - arr[i - 1] > 1) {
                    res = "NO";
                    break;
                }

            }

            System.out.println(res);

        }
    }
}
