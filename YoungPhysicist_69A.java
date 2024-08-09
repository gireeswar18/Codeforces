package codeforces;

import java.util.Scanner;

public class YoungPhysicist_69A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[n][3];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int col = 0; col < 3; col++) {

            int sum = 0;
            for (int row = 0; row < n; row++) {
                sum += arr[row][col];
            }

            if (sum != 0) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}
