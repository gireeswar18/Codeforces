package codeforces;

import java.util.Scanner;

public class PrependAndAppend_1791C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {
            int len = sc.nextInt();
            String str = sc.next();

            int l = 0, r = len - 1;
            int res = len;

            while (l < r) {
                int a = str.charAt(l) - '0';
                int b = str.charAt(r) - '0';
                if (a + b != 1)
                    break;
                res -= 2;
                l++;
                r--;
            }

            System.out.println(res);
        }
    }
}
