package codeforces;

import java.util.Scanner;

public class NewYearTransportation_500A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int target = sc.nextInt();

        int[] arr = new int[n - 1];
        for (int i = 0; i < n - 1; i++)
            arr[i] = sc.nextInt();

        if (target == 1) {
            System.out.println("YES");
            return;
        }
        for (int i = 0; i < n - 1;) {
            i += arr[i];
            System.out.println("Curr: " + (i + 1));
            if (i + 1 == target) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
