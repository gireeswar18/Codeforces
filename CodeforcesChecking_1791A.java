package codeforces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CodeforcesChecking_1791A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        Set<Character> set = new HashSet<>();

        for (char c : "codeforces".toCharArray())
            set.add(c);

        while (test-- != 0) {

            char c = sc.next().charAt(0);
            if (set.contains(c))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
