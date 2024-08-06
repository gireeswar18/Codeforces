package codeforces;

import java.util.Scanner;

public class PetyaAndStrings_112A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        for (int i = 0; i < a.length(); i++) {
            char x = a.charAt(i);
            char y = b.charAt(i);

            if (x >= 'A' && x <= 'Z')
                x = (char) (x + 32);
            if (y >= 'A' && y <= 'Z')
                y = (char) (y + 32);

            if (x > y) {
                System.out.println(1);
                return;
            }

            if (y > x) {
                System.out.println(-1);
                return;
            }

        }

        System.out.println(0);

    }
}
