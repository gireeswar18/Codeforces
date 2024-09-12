package codeforces;

import java.util.Scanner;

public class PanoramixsPrediction_80A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == n && (i + 1) < arr.length && arr[i + 1] == m) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
