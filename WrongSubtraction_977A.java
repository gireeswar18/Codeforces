package codeforces;

import java.util.Scanner;

public class WrongSubtraction_977A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int k = sc.nextInt();

        for (int i = 0; i < k; i++) {

            if (num % 10 == 0)
                num /= 10;
            else
                num--;
        }

        System.out.println(num);
    }
}
