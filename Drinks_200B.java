package codeforces;

import java.util.Scanner;

public class Drinks_200B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        for (int x : arr)
        {
            sum += x;
        }

        double res = (double) sum / n;

        System.out.println(res);

    }

}
