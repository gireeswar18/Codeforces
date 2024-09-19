package codeforces;

import java.util.Scanner;

public class FairDivision_1472B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {

            int n = sc.nextInt();
            int sum = 0;
            int one = 0;

            for (int i = 0; i < n; i++) {

                int w = sc.nextInt();

                if (w == 1) {
                    one++;
                    sum++;
                }
                else
                    sum += 2;
            }

            if (sum % 2 == 0) {

                int part = sum / 2;

                if (part % 2 == 0)
                    System.out.println("yes");
                else {

                    if (one != 0)
                        System.out.println("yes");
                    else
                        System.out.println("no");

                }

            }
            else
                System.out.println("no");
        }
    }
}
