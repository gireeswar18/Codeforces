package codeforces;

import java.util.Scanner;

public class InsomniaCure_148A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int l = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int d = sc.nextInt();

        int total = 0;

        boolean[] arr = new boolean[d + 1];

        for (int i = k; i <= d; i += k)
        {
            if (!arr[i])
                total++;
            arr[i] = true;
        }
        for (int i = l; i <= d; i += l)
        {
            if (!arr[i])
                total++;

            arr[i] = true;
        }
        for (int i = m; i <= d; i += m)
        {
            if (!arr[i])
                total++;

            arr[i] = true;

        }
        for (int i = n; i <= d; i += n)
        {
            if (!arr[i])
                total++;

            arr[i] = true;
        }

        System.out.println(total);
    }
}
