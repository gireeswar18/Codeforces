package codeforces;

import java.util.Scanner;

public class ArrayColoring_1857A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {
            int n = sc.nextInt();

            int sum = 0;

            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();

                sum += num;
            }

            if (sum % 2 == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
