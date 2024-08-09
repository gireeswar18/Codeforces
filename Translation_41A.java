package codeforces;

import java.util.Scanner;

public class Translation_41A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String rev = sc.next();

        if (str.length() != rev.length()) {
            System.out.println("NO");
            return;
        }

        int i = 0;
        int j = rev.length() - 1;

        while (i < str.length() && j >= 0) {

            if (str.charAt(i) != rev.charAt(j)) {
                System.out.println("NO");
                return;
            }

            i++;
            j--;
        }

        System.out.println("YES");
    }

}
