package codeforces;

import java.util.Scanner;

public class Candies_1343A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {

            int num = sc.nextInt();

            int k = 2;
            int val = 0;

            while (true) {
                val = (int) (Math.pow(2, k) - 1);
                if (num % val == 0) {
                    break;
                }
                k++;
            }

            System.out.println(num / val);
        }
    }
}
