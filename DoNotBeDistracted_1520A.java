package codeforces;

import java.util.HashSet;
import java.util.Scanner;

public class DoNotBeDistracted_1520A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {

            int len = sc.nextInt();
            String str = sc.next();

            HashSet<Character> set = new HashSet<>();

            int ind = 0;

            while (ind < len) {

                char c = str.charAt(ind);
                if (!set.add(c)) {
                    System.out.println("NO");
                    break;
                }

                while (ind < len && c == str.charAt(ind)) {
                    ind++;
                }
            }
            if (ind == len)
                System.out.println("YES");

        }
    }
}
