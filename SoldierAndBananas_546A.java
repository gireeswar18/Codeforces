package codeforces;

import java.util.Scanner;

public class SoldierAndBananas_546A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first = sc.nextInt();
        int init = sc.nextInt();
        int total = sc.nextInt();

        int cost = 0;

        for (int i = 1; i <= total; i++) {

            cost += first * i;

        }

        if (cost - init < 0)
            System.out.println(0);
        else
            System.out.println(cost - init);
    }
}
