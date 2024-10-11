package codeforces;

import java.util.Scanner;

public class MoveBrackets_1374C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {
            int n = sc.nextInt();
            String str = sc.next();
            char[] arr = str.toCharArray();

            int oBrackets = 0;
            int cBrackets = 0;

            for (char c : arr) {
                if (c == '(')
                    oBrackets++;
                else if (oBrackets != 0)
                    oBrackets--;
                else
                    cBrackets++;
            }

            System.out.println(cBrackets);
        }
    }
}
