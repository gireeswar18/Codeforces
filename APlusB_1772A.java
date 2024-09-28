package codeforces;

import java.util.Scanner;

public class APlusB_1772A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {

            String str = sc.next();

            System.out.println((str.charAt(0) - '0') + (str.charAt(2) - '0'));

        }
    }
}
