package codeforces;

import java.util.Scanner;

public class SquareString_1619A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {

            String str = sc.next();

            if (str.length() % 2 == 1) {
                System.out.println("NO");
                continue;
            }

            int f = 0;
            int s = str.length() / 2;

            while (s < str.length()) {

                if (str.charAt(f) == str.charAt(s)) {
                    f++;
                    s++;
                }
                else {
                    break;
                }
            }
            if (s == str.length())
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
