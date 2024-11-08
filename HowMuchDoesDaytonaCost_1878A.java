package codeforces;

import java.util.Scanner;

public class HowMuchDoesDaytonaCost_1878A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int n = sc.nextInt();
            int f = sc.nextInt();

            boolean ans = false;

            for (int i = 0; i < n; i++) {
                if (f == sc.nextInt())
                    ans = true;
            }

            System.out.println(ans ? "YES" : "NO");
        }
    }
}
