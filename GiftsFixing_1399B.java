package codeforces;

import java.util.Scanner;

public class GiftsFixing_1399B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int aMin = Integer.MAX_VALUE, bMin = Integer.MAX_VALUE;
            long res = 0;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                aMin = Math.min(aMin, a[i]);
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
                bMin = Math.min(bMin, b[i]);
            }

            for (int i = 0; i < n; i++) {
                if (a[i] - aMin != 0 && b[i] - bMin != 0) {
                    int min = Math.min(a[i] - aMin, b[i] - bMin);
                    a[i] -= min;
                    b[i] -= min;
                    res += min + (a[i] - aMin) + (b[i] - bMin);
                }
                else {
                    res += (a[i] - aMin) + (b[i] - bMin);
                }
            }

            System.out.println(res);
        }
    }
}
