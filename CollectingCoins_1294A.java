package codeforces;

import java.util.Scanner;

public class CollectingCoins_1294A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int n = sc.nextInt();

            int max = Math.max(a, Math.max(b, c));

            int coinsNeeded = (max - a) + (max - b) + (max - c);

            if (n >= coinsNeeded && (n - coinsNeeded) % 3 == 0)
                System.out.println("YES");
            else
                System.out.println("NO");

        }
    }
}
