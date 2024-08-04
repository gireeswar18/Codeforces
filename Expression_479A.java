package codeforces;

import java.util.Scanner;

public class Expression_479A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

//        if (a == b && b == c)
//        {
//            System.out.println(a * b * c);
//        }

        int first = Math.max((a + b) * c, (a * b) + c);
        int second = Math.max(a + (b * c), a * (b + c));
        int third = Math.max(a + b + c, a * b * c);

        if (first >= second && first >= third)
        {
            System.out.println(first);
        }
        else if (second >= first && second >= third)
        {
            System.out.println(second);
        }
        else if (third >= first && third >= second)
        {
            System.out.println(third);
        }

    }
}
