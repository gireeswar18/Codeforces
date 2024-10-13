package codeforces;

import java.util.Scanner;

public class Triple_1669B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {

            int n = sc.nextInt();
            boolean flag = false;
            int res = -1;
            int[] f = new int[n + 1];

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                f[x]++;

                if (!flag && f[x] == 3) {
                    flag = true;
                    res = x;
                }
            }

            System.out.println(flag ? res : -1);
        }
    }
}
