package codeforces;

import java.util.Scanner;

public class Lucky_1676A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {
            String ticket = sc.next();

            int sum1 = 0;
            int sum2 = 0;

            int i = 0;
            int j = 5;

            while (i < j) {
                sum1 += ticket.charAt(i) - '0';
                sum2 += ticket.charAt(j) - '0';
                i++;
                j--;
            }

            System.out.println(sum1 == sum2 ? "YES" : "NO");
        }
    }
}
