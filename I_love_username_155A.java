package codeforces;

import java.util.Scanner;

public class I_love_username_155A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contestCount = sc.nextInt();

        int amazingMoments = 0;

        int contestPoint = sc.nextInt();

        int max = contestPoint;
        int min = contestPoint;

        for (int i = 1; i < contestCount; i++) {

            contestPoint = sc.nextInt();

            if (contestPoint > max) {
                max = contestPoint;
                amazingMoments++;
            }
            else if (contestPoint < min) {
                min = contestPoint;
                amazingMoments++;
            }
        }

        System.out.println(amazingMoments);

    }

}
