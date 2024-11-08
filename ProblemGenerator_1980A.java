package codeforces;

import java.util.Scanner;

public class ProblemGenerator_1980A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] arr = new int[7];
            String str = sc.next();

            for (int i = 0; i < n; i++) {
                arr[str.charAt(i) - 'A']++;
            }

            int cnt = 0;
            for (int i = 0; i < 7; i++) {
                if (arr[i] < m) {
                    cnt += m - arr[i];
                }
            }

            System.out.println(cnt);
        }
    }
}
