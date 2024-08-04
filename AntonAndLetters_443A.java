//package codeforces;

import java.util.Scanner;

public class AntonAndLetters_443A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int count = 0;

        int[] arr = new int[26];

        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == '{' || str.charAt(i) == ' ' || str.charAt(i) == ',')
                continue;

            if (str.charAt(i) == '}')
                break;

            arr[str.charAt(i) - 'a']++;
        }

        for (int x : arr)
        {
            if (x != 0)
                count++;
        }

        System.out.println(count);
    }
}
