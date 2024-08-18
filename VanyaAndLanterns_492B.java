package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class VanyaAndLanterns_492B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int lanternCount = sc.nextInt();
        int length = sc.nextInt();

        int[] pos = new int[lanternCount];

        for (int i = 0; i < lanternCount; i++) {
            pos[i] = sc.nextInt();
        }

        Arrays.sort(pos);

        double maxRadius = 0;

        for (int i = 1; i < lanternCount; i++) {
            maxRadius = Math.max(maxRadius, (pos[i] - pos[i - 1]) / 2.0);
        }

        maxRadius = Math.max(maxRadius, pos[0]);

        maxRadius = Math.max(maxRadius, length - pos[lanternCount - 1]);

        System.out.printf("%.10f", maxRadius);

    }
}