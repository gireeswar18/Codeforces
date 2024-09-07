package codeforces;

import java.util.Scanner;

public class DieRoll_9A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();
        int w = sc.nextInt();

        int max = Math.max(y, w);

        String[] res = new String[]{"", "1/1", "5/6", "2/3", "1/2", "1/3", "1/6"};

        System.out.println(res[max]);
    }
}
