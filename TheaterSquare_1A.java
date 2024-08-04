package codeforces;

import java.util.Scanner;

public class TheaterSquare_1A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int a = sc.nextInt();

        long output1, output2;

        if (m % a == 0)
            output1 = m / a;
        else
            output1 = (m / a) + 1;

        if (n % a == 0)
            output2 = n / a;
        else
            output2 = (n / a) + 1;

        System.out.println(output1 * output2);


    }

}
