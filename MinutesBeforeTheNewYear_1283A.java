package codeforces;

import java.util.Scanner;

public class MinutesBeforeTheNewYear_1283A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {

            int h = sc.nextInt();
            int m = sc.nextInt();

            int time = h * 60 + m;

            System.out.println(1440 - time);

        }
    }
}
