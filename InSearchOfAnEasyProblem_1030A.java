package codeforces;

import java.util.Scanner;

public class InSearchOfAnEasyProblem_1030A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            sum += a;
        }

        System.out.println(sum == 0 ? "EASY" : "HARD");
    }

}
