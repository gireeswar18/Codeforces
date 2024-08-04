//package codeforces;

import java.util.Scanner;

public class Pangram_520A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.next();

        if (n < 26)
        {
            System.out.println("NO");
            return;
        }

        int[] chars = new int[26];

        for (int i = 0; i < n; i++)
        {
            char c = str.charAt(i);

            if (c < 'A' || c > 'Z')
            {
                c = (char) (c - 32);
            }

            chars[c - 'A']++;
        }

        int flag = 0;

        for (int num : chars)
        {
            if (num == 0)
            {
                flag++;
                break;
            }
        }

        if (flag == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
