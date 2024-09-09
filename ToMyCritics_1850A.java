package codeforces;

import java.util.Scanner;

public class ToMyCritics_1850A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a + b >= 10 || a + c >= 10 || b + c >= 10)
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
}
