package codeforces;

import java.util.Scanner;

public class PlusOrMinus_1807A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            System.out.println((a + b) == c ? "+" : "-");
        }
    }
}
