package codeforces;

import java.util.Scanner;

public class MyFirstSortingProblem_1971A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(Math.min(a, b) + " " + Math.max(a, b));
        }
    }
}
