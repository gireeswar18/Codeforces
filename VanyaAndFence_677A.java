package codeforces;

import java.util.Scanner;

public class VanyaAndFence_677A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int height = sc.nextInt();

        int width = 0;

        for (int i = 0; i < num; i++) {

            int x = sc.nextInt();

            if (x > height) width++;

            width++;
        }

        System.out.println(width);
    }
}
