package codeforces;

import java.util.Scanner;

public class ChoosingTeam_432A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int teams = 0;
        int count = 0;

        for (int x : arr) {
            if (5 - x >= k)
                count++;

            if (count == 3) {
                teams++;
                count = 0;
            }
        }

        System.out.println(teams);
    }
}
