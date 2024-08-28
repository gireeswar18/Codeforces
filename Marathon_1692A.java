package codeforces;

import java.util.Scanner;

public class Marathon_1692A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {
            int a = sc.nextInt();

            int peopleAhead = 0;

            for (int i = 0; i < 3; i++) {

                if (a < sc.nextInt())
                    peopleAhead++;

            }

            System.out.println(peopleAhead);
        }
    }
}
