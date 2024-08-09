package codeforces;

import java.util.Scanner;

public class NearlyLuckyNumber_110A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.next();

        System.out.println(isLucky(num));

    }

    private static String isLucky(String num) {

        int lucky = 0;

        for (char c : num.toCharArray()) {

            if (c == '4' || c == '7')
                lucky++;

        }
        if (lucky == 0) return "NO";

        while (lucky != 0) {
            if (lucky % 10 != 4 && lucky % 10 != 7)
                return "NO";
            lucky /= 10;
        }

        return "YES";
    }
}
