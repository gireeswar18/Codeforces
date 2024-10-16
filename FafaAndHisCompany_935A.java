package codeforces;

import java.util.Scanner;

public class FafaAndHisCompany_935A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = 0;
        int n = sc.nextInt();

        for (int i = 1; i <= n / 2; i++) {
            if ((n - i) % i == 0)
                t++;
        }

        System.out.println(t);
    }
}
