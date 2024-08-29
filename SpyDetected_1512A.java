package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class SpyDetected_1512A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {

            int size = sc.nextInt();

            int[] ind = new int[101];

            for (int i = 0; i < size; i++) {

                int val = sc.nextInt();

                if (ind[val] == 0)
                    ind[val] = i + 1;
                else
                    ind[val] = -1;
            }

//            System.out.println(Arrays.toString(ind));

            for (int n : ind) {
                if (n != -1 && n != 0) {
                    System.out.println(n);
                    break;
                }
            }
        }
    }
}
