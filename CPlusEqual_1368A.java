package codeforces;

import java.util.Scanner;

public class CPlusEqual_1368A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            int cnt = 0;
            while (a + b <= n) {
                if (a > b) {
                    b += a;
                }
                else {
                    a += b;
                }
                cnt++;
            }

            System.out.println(cnt + 1);
        }
    }
}
