package codeforces;

import java.util.Scanner;

public class NotQuiteLatinSquare_1915B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int find = -1;
            int[][] rows = new int[3][3];

            for (int i = 0; i < 3; i++) {
                String str = sc.next();
                for (char c : str.toCharArray()) {
                    if (c == '?') {
                        find = i;
                        continue;
                    }
                    rows[i][c - 'A']++;
                }
            }

            for (int i = 0; i < 3; i++) {
                if (rows[find][i] == 0) {
                    System.out.println((char) ('A' + i));
                    break;
                }
            }
        }
    }
}
