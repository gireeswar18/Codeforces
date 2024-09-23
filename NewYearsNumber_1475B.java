package codeforces;

import java.util.Scanner;

public class NewYearsNumber_1475B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {

            int num = sc.nextInt();

            if (num < 2020) {
                System.out.println("NO");
                continue;
            }

            if (num % 2 == 1)
                num -= 2021;

            if (num % 2020 == 0 || num % 2021 == 0)
                System.out.println("YES");
            else
                System.out.println("NO");

        }
    }
}
