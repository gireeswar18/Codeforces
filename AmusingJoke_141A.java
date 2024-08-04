package codeforces;

import java.util.Scanner;

public class AmusingJoke_141A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();

        System.out.println(amusingJoke(a, b, c));

    }

    private static String amusingJoke(String a, String b, String c) {

        int[] freq = new int[26];

        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();
        char[] arr3 = c.toCharArray();

        for (char x : arr1) {
            freq[x - 'A']++;
        }
        for (char x : arr2) {
            freq[x - 'A']++;
        }
        for (char x : arr3) {
            freq[x - 'A']--;
        }

        for (int x : freq) {
            if (x != 0)
                return "NO";
        }

        return "YES";

    }


}
