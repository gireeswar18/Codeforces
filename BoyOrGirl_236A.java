package codeforces;

import java.util.HashSet;
import java.util.Scanner;

public class BoyOrGirl_236A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        HashSet<Character> hs = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {

            hs.add(str.charAt(i));

        }

        if (hs.size() % 2 == 0)
            System.out.println("CHAT WITH HER!");
        else
            System.out.println("IGNORE HIM!");
    }
}
