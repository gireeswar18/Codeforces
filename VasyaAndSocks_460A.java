package codeforces;

import java.util.Scanner;

public class VasyaAndSocks_460A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int days = 0;

        while (n != 0) {
            days++;
            if (days % m != 0) {
                n--;
            }
        }

        System.out.println(days);
    }
}
