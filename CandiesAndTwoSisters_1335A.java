package codeforces;

import java.util.Scanner;

public class CandiesAndTwoSisters_1335A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        for (int num : arr)
        {
            if (num % 2 == 0)
            {
                System.out.println((num / 2) - 1);
            }
            else
            {
                System.out.println(num / 2);
            }
        }
    }
}
