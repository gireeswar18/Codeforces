package codeforces;

import java.util.Scanner;

public class LuckyNumber_122A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (isLucky(num)) {
            System.out.println("YES");
            return;
        }

        for (int i = 4; i <= num / 2; i++) {

            if (isLucky(i) && num % i == 0) {
                System.out.println("YES");
                return;
            }

        }
        System.out.println("NO");
    }

    private static boolean isLucky(int num) {

        while (num != 0) {
            if (num % 10 != 4 && num % 10 != 7)
                return false;
            num /= 10;
        }

        return true;
    }
}
