package codeforces;

import java.util.Scanner;

public class CapsLock_131A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();

        // If first char is small and remaining are caps then change
        // or if all chars are caps then change to small
        if (str.charAt(0) >= 'a' && str.charAt(0) <= 'z')
        {
            if (checkRemainingIsCaps(arr))
            {
                arr[0] -= 32;
                for (int i = 1; i < arr.length; i++)
                {
                    arr[i] += 32;
                }
                System.out.println(String.valueOf(arr));
                return;
            }
        }
        else if (allCaps(arr))
        {
            System.out.println(str.toLowerCase());
            return;
        }

        System.out.println(str);

    }

    private static boolean allCaps(char[] arr) {

        for (int i = 0; i < arr.length; i++)
        {
            if (!(arr[i] >= 'A' && arr[i] <= 'Z'))
                return false;
        }
        return true;

    }

    private static boolean checkRemainingIsCaps(char[] arr) {

        for (int i = 1; i < arr.length; i++)
        {
            if (!(arr[i] >= 'A' && arr[i] <= 'Z'))
                return false;
        }
        return true;
    }
}
