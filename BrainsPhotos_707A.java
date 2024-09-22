package codeforces;

import java.util.Scanner;

public class BrainsPhotos_707A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        boolean isC = false;

        for (int i = 0; i < m * n; i++) {
            char color = sc.next().charAt(0);

            if (!isC && color != 'B' && color != 'W' && color != 'G') {
                isC = true;
            }

        }

        System.out.println(isC ? "#Color" : "#Black&White");
    }
}
