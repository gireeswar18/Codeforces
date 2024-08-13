package codeforces;

import java.util.Scanner;

public class FoxAndSnake_510A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        char[][] arr = new char[n][m];

        boolean left = true;
        boolean right = false;

        for (int i = 0; i < n; i++) {
            if ((i + 1) % 2 == 1) {
                right = !right;
                left = !left;
            }
            for (int j = 0; j < m; j++) {

                if ((i + 1) % 2 == 1) {
                    arr[i][j] = '#';
                }
                else if (j == m - 1 && right) {

                    arr[i][j] = '#';

                }
                else if (j == 0 && left) {
                    arr[i][j] = '#';
                }
                else
                    arr[i][j] = '.';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
