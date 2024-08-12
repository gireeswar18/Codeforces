package codeforces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BeautifulYear_271A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        for (int i = year + 1;;i++) {

            if (isDistinct(i)) {
                System.out.println(i);
                return;
            }
        }
    }

    private static boolean isDistinct(int year) {

        Set<Integer> set = new HashSet<>();

        while (year != 0) {

            if (!set.add(year % 10))
                return false;
            year /= 10;
        }
        return true;
    }
}
