package codeforces.div4.Round_971;

import java.util.Scanner;

public class Minimize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(Math.abs(a - b));
        }
    }
}
