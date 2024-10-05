package codeforces;

import java.util.Scanner;

public class NightAtTheMuseum_731A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char curr = 'a';
        int res = 0;

        for (char c : str.toCharArray()) {

            int moves = Math.abs(curr - c);
            res += Math.min(moves, Math.abs(moves - 26));
            curr = c;
        }

        System.out.println(res);
    }
}
