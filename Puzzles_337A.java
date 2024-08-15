package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Puzzles_337A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int students = sc.nextInt();
        int puzzles = sc.nextInt();

        int[] arr = new int[puzzles];
        int res = Integer.MAX_VALUE;

        for (int i = 0; i < puzzles; i++) {

            arr[i] = sc.nextInt();

        }

        Arrays.sort(arr);


        for (int i = 0; i <= puzzles - students; i++) {

            res = Math.min(res, arr[i + students - 1] - arr[i]);
        }

        System.out.println(res == Integer.MAX_VALUE ? 0 : res);
    }
}