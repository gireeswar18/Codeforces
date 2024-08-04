package codeforces;

import java.util.Scanner;

public class DivisibilityProblem_1328A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- != 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a % b == 0) {
                System.out.println(0);
            }
            else {
                int div = (a / b);
//                System.out.println("When a and b are divided: " + div);
                div++;
//                System.out.println("After increment: " + div);
                System.out.println(div * b - a);
            }
        }
    }
}