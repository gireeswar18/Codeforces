package codeforces;

import java.util.Scanner;

public class Borze_32B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String code = sc.next();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < code.length(); i++) {

            if (code.charAt(i) == '.')
                sb.append(0);

            else if (code.charAt(i) == '-' && code.charAt(i + 1) == '.') {
                sb.append(1);
                i++;
            }

            else {
                sb.append(2);
                i++;
            }

        }

        System.out.println(sb);
    }
}
