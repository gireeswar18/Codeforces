package codeforces;

import java.util.Scanner;

public class XeniaAndRingRoad_339B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfHouses = sc.nextInt();
        int tasks = sc.nextInt();

        long time = 0;
        long workHouse;
        long curr = 1;

        for (int i = 0; i < tasks; i++) {
            workHouse = sc.nextInt();

            if (workHouse >= curr) {
                time += workHouse - curr;
            }
            else {
                time += numberOfHouses - curr + workHouse;
            }
            curr = workHouse;
        }

        System.out.println(time);
    }
}
