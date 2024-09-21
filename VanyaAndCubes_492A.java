package codeforces;

import java.util.Scanner;

public class VanyaAndCubes_492A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cubes = sc.nextInt();

        int height = 0;
        int needed = 1;
        int add = 2;

        while (cubes >= needed) {

            height++;
            cubes -= needed;
            needed += add;
            add++;

        }

        System.out.println(height);
    }
}
