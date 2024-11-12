package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class X_Axis_1986A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            int x3 = sc.nextInt();

            int[] pts = {x1, x2, x3};
            Arrays.sort(pts);

            int mid = pts[1];

            System.out.println(Math.abs(mid - pts[0]) + Math.abs(mid - pts[2]));
        }
    }
}
