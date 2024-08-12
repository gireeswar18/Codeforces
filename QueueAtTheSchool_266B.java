package codeforces;

import java.util.Scanner;

public class QueueAtTheSchool_266B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        String str = sc.next();
        for (int i = 0; i < t; i++) {
            str = str.replace("BG", "GB");
        }
        System.out.println(str);
    }
}
