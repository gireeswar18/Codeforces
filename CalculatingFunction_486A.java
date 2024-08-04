package codeforces;

import java.util.Scanner;

public class CalculatingFunction_486A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long res = 0;

        if (n % 2 == 0)
        {
            res = n / 2;
        }
        else
        {
            res = ((n / 2) + 1) * -1;
        }

        System.out.println(res);
    }
}
