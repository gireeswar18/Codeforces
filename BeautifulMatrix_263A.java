package codeforces;

import java.util.Scanner;

public class BeautifulMatrix_263A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] mat = new int[5][5];


        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                mat[i][j] = sc.nextInt();


        int posI = -1, posJ = -1;

        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                if (mat[i][j] == 1) {

                    posI = i;
                    posJ = j;
                    break;

                }

        System.out.println(Math.abs(posI - 2) + Math.abs(posJ - 2));
    }
}
