package codeforces;

import java.util.Scanner;

public class LCMProblem_1389A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int x = -1, y = -1;

            if (l * 2 <= r) {
                x = l;
                y = l * 2;
            }

            System.out.println(x + " " + y);
        }
    }

}
