package codeforces;

import java.util.Scanner;

public class TargetPractice_1879C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int[][] grid = {
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 2, 2, 2, 2, 2, 2, 2, 2, 1},
                {1, 2, 3, 3, 3, 3, 3, 3, 2, 1},
                {1, 2, 3, 4, 4, 4, 4, 3, 2, 1},
                {1, 2, 3, 4, 5, 5, 4, 3, 2, 1},
                {1, 2, 3, 4, 5, 5, 4, 3, 2, 1},
                {1, 2, 3, 4, 4, 4, 4, 3, 2, 1},
                {1, 2, 3, 3, 3, 3, 3, 3, 2, 1},
                {1, 2, 2, 2, 2, 2, 2, 2, 2, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
        };

        while (t-- != 0) {
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                String str = sc.next();
                for (int j = 0; j < 10; j++) {
                    if (str.charAt(j) == 'X') {
                        sum += grid[i][j];
                    }
                }
            }

            System.out.println(sum);
        }
    }
}
