package codeforces;

import java.util.Scanner;

public class BitPlusPlus_282A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();
        int val = 0;

        while (test-- != 0) {

            String str = sc.next();

            if (str.charAt(0) == '+' || str.charAt(2) == '+')
                val++;

            else
                val--;

        }

        System.out.println(val);
    }
}
