package codeforces;

import java.util.Scanner;

public class Elephant_617A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int steps = 0;

        while (n != 0) {

            if (n >= 5) {
                steps += n / 5;
                n %= 5;
            }
            else if (n >= 4) {
                steps += n / 4;
                n %= 4;
            }
            else if (n >= 3) {
                steps += n / 3;
                n %= 3;
            }
            else if (n >= 2) {
                steps += n / 2;
                n %= 2;
            }
            else {
                steps++;
                n = 0;
            }

        }

        System.out.println(steps);
    }
}
