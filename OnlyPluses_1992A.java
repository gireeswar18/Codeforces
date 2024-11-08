package codeforces;

import java.util.Scanner;

public class OnlyPluses_1992A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            for (int i = 0; i < 5; i++) {
                if (a > b) {
                    int temp = a;
                    a = b;
                    b = temp;
                }
                if (a > c) {
                    int temp = a;
                    a = c;
                    c = temp;
                }
                if (b > c) {
                    int temp = b;
                    b = c;
                    c = temp;
                }
                a++;
            }

            System.out.println(a * b * c);
        }
    }

}
