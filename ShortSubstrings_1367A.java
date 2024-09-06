package codeforces;

import java.util.Scanner;

public class ShortSubstrings_1367A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {

            String str = sc.next();

            StringBuilder res = new StringBuilder();

            for (int i = 0; i < str.length(); i += 2) {
                res.append(str.charAt(i));
            }

            res.append(str.charAt(str.length() - 1));

            System.out.println(res);
        }
    }
}
