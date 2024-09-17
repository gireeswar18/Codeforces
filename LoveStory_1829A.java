package codeforces;

import java.util.Scanner;

public class LoveStory_1829A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {

            String str = sc.next();

            int count = 0;

            String c = "codeforces";

            for (int i = 0; i < 10; i++)
                if (str.charAt(i) != c.charAt(i))
                    count++;

            System.out.println(count);
        }

    }
}
