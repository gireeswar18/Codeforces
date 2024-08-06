package codeforces;

import java.util.Scanner;

public class HelpfulMaths_339A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int i = 0;
        int j = 0;
        int k = str.length() - 1;

        char[] arr = str.toCharArray();

        while (j <= k) {

            if (arr[j] == '1') {

                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i += 2;
                j += 2;

            }

            else if (arr[j] == '3') {

                char temp = arr[k];
                arr[k] = arr[j];
                arr[j] = temp;
                k -= 2;

            }

            else
                j += 2;

        }

        System.out.println(String.valueOf(arr));
    }
}
