package codeforces;

import java.util.Scanner;

public class Word_59A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int lower = 0;
        int upper = 0;

        for (char c : str.toCharArray()) {

            if (Character.isLowerCase(c))
                lower++;
            else
                upper++;
        }

        if (lower >= upper)
            System.out.println(str.toLowerCase());
        else
            System.out.println(str.toUpperCase());
    }
}
