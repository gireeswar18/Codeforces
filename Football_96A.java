package codeforces;

import java.util.Scanner;

public class Football_96A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        char val = str.charAt(0);
        int cons = 1;

        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) == val)
                cons++;

            else {
                val = str.charAt(i);
                cons = 1;
            }

            if (cons == 7) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");

    }
}
