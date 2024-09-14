package codeforces;

import java.util.Scanner;

public class ChewbaccaAndNumber_514A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();

        long inv = 0;
        long fact = 1;

        while (num != 0) {

            long digit = num % 10;

            if ((digit == 9 && num / 10 != 0) || (digit >= 5 && digit <= 8)) {
                inv = (9 - digit) * fact + inv;
            }
            else {
                inv = digit * fact + inv;
            }

            fact *= 10;
            num /= 10;
        }

        System.out.println(inv);
    }
}