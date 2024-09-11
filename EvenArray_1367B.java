package codeforces;

import java.util.Scanner;

public class EvenArray_1367B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {
            int size = sc.nextInt();

            int e = 0;
            int o = 0;

            for (int i = 0; i < size; i++) {
                int val = sc.nextInt();

                if (val % 2 == 0 && i % 2 != 0) {
                    e++;
                }
                else if (val % 2 == 1 && i % 2 != 1) {
                    o++;
                }
            }

            if (e == o)
                System.out.println(e);
            else
                System.out.println(-1);
        }
    }
}
