//package codeforces;

import java.util.Scanner;

public class DubStep_208A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        StringBuilder sb = new StringBuilder();

        int len = str.length();
        int flag = 0;

        for (int i = 0; i < len; i++)
        {
            if (str.charAt(i) == 'W' && i + 1 < len && str.charAt(i + 1) == 'U' && i + 2 < len && str.charAt(i + 2) == 'B')
            {
                flag = 1;
                i += 2;
            }
            else
            {
                if (flag == 1)
                {
                    sb.append(" ");
                    flag = 0;
                }
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString().trim());
    }
}
