package codeforces;

import java.util.Scanner;

public class Hulk_705A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++)
        {
            if (i % 2 == 1)
            {
                sb.append("I hate ");
            }
            else
            {
                sb.append("I love ");
            }
            if (i + 1 <= n)
                sb.append("that ");
        }

        sb.append("it");

        System.out.println(sb.toString());
    }

}
