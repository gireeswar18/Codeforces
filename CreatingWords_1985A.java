package codeforces;

import java.util.Scanner;

public class CreatingWords_1985A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {
            String a = sc.next();
            String b = sc.next();

            System.out.print(b.charAt(0) + a.substring(1) + " ");
            System.out.println(a.charAt(0) + b.substring(1));
        }
    }
}
