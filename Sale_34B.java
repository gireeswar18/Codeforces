package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Sale_34B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);

        int ind = 0;
        int res = 0;

        while (ind < n && ind < m && arr[ind] < 0) {
            res += -arr[ind++];
        }

        System.out.println(res);
    }
}
