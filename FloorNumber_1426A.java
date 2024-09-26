package codeforces;

import java.util.Scanner;

public class FloorNumber_1426A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {

            int num = sc.nextInt();
            int flats = sc.nextInt();

            if (num < 3) {
                System.out.println(1);
                continue;
            }

            int floor = 1;
            int currFlats = 2;

            while (num > currFlats) {
                floor++;
                currFlats += flats;
            }

            System.out.println(floor);

        }
    }
}
