package codeforces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Increasing_1742B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {

            int size = sc.nextInt();

            Set<Integer> set = new HashSet<>();

            for (int i = 0; i < size; i++) {
                set.add(sc.nextInt());
            }

            if (set.size() == size)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
