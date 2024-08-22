package codeforces;

import java.util.Scanner;

public class RestoringThreeNumbers_1154A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[4];

        for (int i = 0; i < 4; i++)
            arr[i] = sc.nextInt();

        int max = Integer.MIN_VALUE;
        int ind = -1;

        for (int i = 0; i < 4; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ind = i;
            }
        }

        for (int i = 0; i < 4; i++) {
            if (i != ind) {
                System.out.print(max - arr[i] + " ");
            }
        }

    }
}
/*
    3 6 5 4

    a + b + c = 6

    6 - (a + b) = c 3
    6 - (a + c) = b 1
    6 - (b + c) = a 2

 */