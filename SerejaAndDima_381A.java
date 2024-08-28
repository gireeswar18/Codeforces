package codeforces;

import java.util.Scanner;

public class SerejaAndDima_381A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int s = 0;
        int d = 0;

        int i = 0;
        int j = n - 1;
        boolean sTurn = true;

        while (i <= j) {

            if (sTurn) {
                if (arr[i] > arr[j]) {
                    s += arr[i++];
                }
                else {
                    s += arr[j--];
                }
            }
            else {
                if (arr[i] > arr[j]) {
                    d += arr[i++];
                }
                else {
                    d += arr[j--];
                }
            }

            sTurn = !sTurn;
        }

        System.out.println(s + " " + d);
    }
}
