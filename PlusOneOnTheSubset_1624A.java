package codeforces;

import java.util.Scanner;

public class PlusOneOnTheSubset_1624A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {

            int size = sc.nextInt();

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < size; i++) {
                int val = sc.nextInt();

                max = Math.max(max, val);
                min = Math.min(min, val);
            }

            System.out.println(max - min);
        }
    }
}
