package codeforces;

import java.util.Scanner;

public class AddOddOrSubtractEven_1311A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int diff = b - a;
            if (diff == 0) {
                System.out.println(0);
                continue;
            }

            if (diff % 2 == 0) {
                System.out.println(diff > 0 ? 2 : 1);
            }
            else {
                System.out.println(diff > 0 ? 1 : 2);
            }
        }
    }
}
