package codeforces;

import java.util.Scanner;

public class HitTheLottery_996A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int res = 0;

        while (n != 0)
        {
            if (n >= 100)
            {
                res += n / 100;
                n %= 100;
            }
            else if (n >= 20)
            {
                res += n / 20;
                n %= 20;
            }
            else if (n >= 10)
            {
                res += n / 10;
                n %= 10;
            }
            else if (n >= 5)
            {
                res += n / 5;
                n %= 5;
            }
            else
            {
                res += n;
                n = 0;
            }
        }
        System.out.println(res);
    }
}
