package codeforces;

import java.util.Scanner;

public class Games_268A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < 2; j++)
                arr[i][j] = sc.nextInt();

        int count = 0;

        for (int i = 0; i < n; i++)
        {
            int home = arr[i][0];
            for (int j = 0; j < n; j++)
            {
                if (home == arr[j][1])
                    count++;
            }
        }

        System.out.println(count);
    }
}
