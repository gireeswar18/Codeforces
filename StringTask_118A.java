package codeforces;

import java.util.Scanner;

public class StringTask_118A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);
            if (c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U' && c != 'Y' &&
                c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c != 'y') {

                sb.append(".");
                if (c >= 'A' && c <= 'Z')
                    c = (char) (c + 32);

                sb.append(c);

            }

        }

        System.out.println(sb);
    }
}
