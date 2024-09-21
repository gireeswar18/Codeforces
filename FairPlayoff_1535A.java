package codeforces;

import java.util.Scanner;

public class FairPlayoff_1535A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            if (Math.max(a, b) > Math.min(c, d) && Math.max(c, d) > Math.min(a, b))
                System.out.println("YES");
            else
                System.out.println("NO");

        }
    }
}
