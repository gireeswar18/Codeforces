package codeforces;

import java.util.Scanner;

public class ArrivalOfTheGeneral_144A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        int max = arr[0];
        int maxInd = 0;
        int minInd = 0;

        for (int i = 1; i < n; i++)
        {
            if (arr[i] <= min)
            {
                min = arr[i];
                minInd = i;
            }
            else if (arr[i] > max)
            {
                max = arr[i];
                maxInd = i;
            }
        }

        if (minInd < maxInd)
        {
            maxInd--;
        }

        System.out.println((n - 1 - minInd) + maxInd);

    }
}
