package codeforces;

import java.util.Scanner;

public class YesOrYes_1703A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n-- != 0) {

            String str = sc.next();

            boolean y = str.charAt(0) == 'Y' || str.charAt(0) == 'y';
            boolean e = str.charAt(1) == 'E' || str.charAt(1) == 'e';
            boolean s = str.charAt(2) == 'S' || str.charAt(2) == 's';

            if (y && e && s) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}
