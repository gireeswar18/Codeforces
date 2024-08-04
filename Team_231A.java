package codeforces;

import java.util.Scanner;

public class Team_231A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        int count = 0;

        while(q-- != 0) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a + b + c >= 2)
                count++;

        }

        System.out.println(count);
    }


}
