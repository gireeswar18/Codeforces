package codeforces;

import java.util.Scanner;

public class Puzzles_337A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int students = sc.nextInt();
        int puzzles = sc.nextInt();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int res = Integer.MAX_VALUE;

        for (int i = 0; i < puzzles; i++) {

            int puzzle = sc.nextInt();

            if (puzzle < min)
                min = puzzle;
            if (puzzle > max)
                max = puzzle;

            if (max != min)
                res = Math.min(res, max - min);

        }

        System.out.println(res);
    }
}
