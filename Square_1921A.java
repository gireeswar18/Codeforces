package codeforces;

import java.util.Scanner;

public class Square_1921A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int x3 = sc.nextInt();
            int y3 = sc.nextInt();
            int x4 = sc.nextInt();
            int y4 = sc.nextInt();

            int d1 = distanceSquared(x1, y1, x2, y2);
            int d2 = distanceSquared(x1, y1, x3, y3);
            int d3 = distanceSquared(x1, y1, x4, y4);
            int d4 = distanceSquared(x2, y2, x3, y3);
            int d5 = distanceSquared(x2, y2, x4, y4);
            int d6 = distanceSquared(x3, y3, x4, y4);

            int sideSquared = Math.min(Math.min(d1, d2), Math.min(d3, Math.min(d4, Math.min(d5, d6))));

            System.out.println(sideSquared);
        }
    }

    public static int distanceSquared(int x1, int y1, int x2, int y2) {
        return (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
    }
}
