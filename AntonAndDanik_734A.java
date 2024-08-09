package codeforces;

import java.util.Scanner;

public class AntonAndDanik_734A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String str = sc.next();

        int A = 0;
        int D = 0;

        for (char c : str.toCharArray()) {

            if (c == 'A')
                A++;
            else
                D++;
        }

        if (A == D)
            System.out.println("Friendship");
        else if (A > D)
            System.out.println("Anton");
        else
            System.out.println("Danik");
    }
}
