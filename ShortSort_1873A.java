package codeforces;

import java.util.Scanner;

public class ShortSort_1873A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {

            String str = sc.next();

            if (str.equals("abc") || str.equals("acb") || str.equals("cba") || str.equals("bac"))
                System.out.println("YES");
            else
                System.out.println("NO");

        }
    }
}
