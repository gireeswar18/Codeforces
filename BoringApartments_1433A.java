package codeforces;

import java.util.Scanner;

public class BoringApartments_1433A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {0, 1, 3, 6, 10};

        int test = sc.nextInt();

        while (test-- != 0) {

            int num = sc.nextInt();
            int res = 0;

            int last = num % 10;
            if (last - 1 != 0) {

                res = (last - 1) * 10;

            }

            int len = 0;
            while (num != 0) {
                len++;
                num /= 10;
            }

            res += arr[len];

            System.out.println(res);

        }

    }
}
