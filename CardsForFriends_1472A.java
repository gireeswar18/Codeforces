package codeforces;

import java.util.Scanner;

public class CardsForFriends_1472A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int w = sc.nextInt();
            int h = sc.nextInt();
            int n = sc.nextInt();

            int cnt = 1;

            while (w % 2 == 0) {
                w /= 2;
                cnt *= 2;
            }

            while (h % 2 == 0) {
                h /= 2;
                cnt *= 2;
            }

            System.out.println(cnt >= n ? "YES" : "NO");
        }
    }
}
