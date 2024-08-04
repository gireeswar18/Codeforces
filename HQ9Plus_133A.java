package codeforces;

import java.util.Scanner;

public class HQ9Plus_133A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int flag = 0;

        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == 'H' || str.charAt(i) == 'Q' || str.charAt(i) == '9')
            {
                flag++;
                break;
            }
        }

        if (flag == 0)
            System.out.println("NO");
        else
            System.out.println("YES");
    }
}
