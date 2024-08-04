package codeforces;

import java.util.Scanner;

public class WayTooLongWords_71A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {

            String str = sc.next();
            if (str.length() <= 10)
                System.out.println(str);
            else {
                StringBuilder sb = new StringBuilder();
                sb.append(str.charAt(0));
                sb.append(str.length() - 2);
                sb.append(str.charAt(str.length() - 1));

                System.out.println(sb);
            }

        }
    }
}
