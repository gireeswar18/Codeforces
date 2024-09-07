package codeforces;

import java.util.Scanner;

public class MishkaAndGame_703A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int games = sc.nextInt();

        int m = 0;
        int c = 0;

        for (int i = 0; i < games; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a > b) m++;
            else if (a < b) c++;

        }

        if (m > c)
            System.out.println("Mishka");
        else if (m < c)
            System.out.println("Chris");
        else
            System.out.println("Friendship is magic!^^");
    }
}
