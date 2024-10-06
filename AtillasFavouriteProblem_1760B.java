package codeforces;

import java.util.Scanner;

public class AtillasFavouriteProblem_1760B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {
            int n = sc.nextInt();
            String str = sc.next();

            int res = 0;
            for (char c : str.toCharArray()) {
                if (c - 'a' > res)
                    res = c - 'a';
            }

            System.out.println(res + 1);
        }
    }
}
