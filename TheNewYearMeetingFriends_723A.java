package codeforces;

import java.util.Scanner;

public class TheNewYearMeetingFriends_723A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i = 0; i < 3; i++) {

            int point = sc.nextInt();

            if (point > first) {
                third = second;
                second = first;
                first = point;
            }
            else if (point > second) {
                third = second;
                second = point;
            }
            else {
                third = point;
            }

        }

        System.out.println("first: " + first);
        System.out.println("second: " + second);
        System.out.println("third: " + third);

        System.out.println(second - third + first - second);
    }
}
