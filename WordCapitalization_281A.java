package codeforces;

import java.util.Scanner;

public class WordCapitalization_281A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        char c = str.charAt(0);

        if (c >= 'A' && c <= 'Z')
            System.out.println(str);
        else {

            char[] arr = str.toCharArray();
            arr[0] = (char) (c - 32);

            System.out.println(String.valueOf(arr));

        }
    }
}
