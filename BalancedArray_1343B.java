package codeforces;

import java.util.Scanner;

public class BalancedArray_1343B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {

            int num = sc.nextInt();

            int[] arr = new int[num];

            int evenSum = 0;
            int n = 2;

            for (int i = 0; i < num / 2; i++) {
                arr[i] = n;
                evenSum += n;
                n += 2;
            }
            n = 1;

            for (int i = num / 2; i < num - 1; i++) {
                arr[i] = n;
                evenSum -= n;
                n += 2;
            }

            if (evenSum % 2 == 1) {
                arr[num - 1] = evenSum;

                System.out.println("YES");
                for (int x : arr)
                    System.out.print(x + " ");

                System.out.println();
            }
            else {
                System.out.println("NO");
            }

        }
    }
}
