package codeforces;

import java.util.Scanner;

public class ArrayWithOddSum_1296A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int n = sc.nextInt();

            int even = 0, odd = 0, sum = 0;

            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                if (num % 2 == 0) {
                    even++;
                }
                else {
                    odd++;
                }

                sum += num;
            }

            if (sum % 2 == 1 || (odd > 0 && even > 0))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
