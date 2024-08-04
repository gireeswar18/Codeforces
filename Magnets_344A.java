package codeforces;

import java.util.Scanner;

public class Magnets_344A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.next();
        }
        int groups = 0;

        for (int i = 0; i < n - 1; i++)
        {
            if (arr[i].charAt(0) != arr[i + 1].charAt(0))
                groups++;
        }

        System.out.println(groups + 1);

    }

}
