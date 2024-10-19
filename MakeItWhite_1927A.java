package codeforces;

import java.util.Scanner;

public class MakeItWhite_1927A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int n = sc.nextInt();
            String str = sc.next();

            int i = 0;
            int j = n - 1;

            while (i < n && str.charAt(i) == 'W') {
               i++;
            }
            while (j >= i && str.charAt(j) == 'W') {
                j--;
            }

            System.out.println(j - i + 1);
        }
    }
}
