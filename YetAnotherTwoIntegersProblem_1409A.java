package codeforces;

import java.util.Scanner;

public class YetAnotherTwoIntegersProblem_1409A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {

            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == b) {
                System.out.println(0);
                continue;
            }

            int x = Math.abs(a - b);

            int steps = 0;

            if (x >= 10) {
                steps += (x / 10);
                x %= 10;
            }
            if (x != 0){
                steps += 1;
            }

            System.out.println(steps);
        }
    }
}
