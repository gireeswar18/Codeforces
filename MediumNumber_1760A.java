package codeforces;

import java.util.Scanner;

public class MediumNumber_1760A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a < b && a > c || a < c && a > b)
                System.out.println(a);
            else if (b < a && b > c || b < c && b > a)
                System.out.println(b);
            else
                System.out.println(c);
        }
    }
}
