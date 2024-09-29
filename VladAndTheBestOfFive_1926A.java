package codeforces;

import java.util.Scanner;

public class VladAndTheBestOfFive_1926A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {
            String str = sc.next();

            int a = 0, b = 0;

            for (char c : str.toCharArray()) {
                if (c == 'A') {
                    a++;
                } else {
                    b++;
                }
            }

            System.out.println(a > b ? "A" : "B");
        }
    }
}
