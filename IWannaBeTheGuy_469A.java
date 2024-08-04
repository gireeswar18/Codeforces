package codeforces;

import java.util.Scanner;

public class IWannaBeTheGuy_469A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int p = sc.nextInt();
        int[] arr1 = new int[p];

        for (int i = 0; i < p; i++)
        {
            arr1[i] = sc.nextInt();
        }

        int q = sc.nextInt();
        int[] arr2 = new int[q];

        for (int i = 0; i < q; i++)
        {
            arr2[i] = sc.nextInt();
        }

        boolean[] levels = new boolean[n];

        for (int i = 0; i < p; i++)
        {
            levels[arr1[i] - 1] = true;
        }
        for (int i = 0; i < q; i++)
        {
            levels[arr2[i] - 1] = true;
        }

        int flag = 0;
        for (boolean b : levels)
        {
            if (!b)
            {
                flag++;
                break;
            }
        }

        if (flag == 0)
            System.out.println("I become the guy.");
        else
            System.out.println("Oh, my keyboard!");
    }
}
