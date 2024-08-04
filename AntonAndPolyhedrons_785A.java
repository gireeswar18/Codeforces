//package codeforces;

import java.util.Scanner;

public class AntonAndPolyhedrons_785A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = 0;

        String[] arr = new String[n];

        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.next();
        }

        for (String x : arr)
        {
            if (x.equals("Tetrahedron"))
                sum += 4;
            else if (x.equals("Cube"))
                sum += 6;
            else if (x.equals("Octahedron"))
                sum += 8;
            else if (x.equals("Dodecahedron"))
                sum += 12;
            else
                sum += 20;
        }

        System.out.println(sum);
    }
}
