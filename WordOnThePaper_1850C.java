package codeforces;

import java.util.*;

public class WordOnThePaper_1850C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {
            String[] arr = new String[8];
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < 8; i++) {
                arr[i] = sc.next();
            }

            for (String s : arr) {
                for (char c : s.toCharArray()) {
                    if (c != '.')
                        sb.append(c);
                }
            }

            System.out.println(sb);
        }
    }
}
