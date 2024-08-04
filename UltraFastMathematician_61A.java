package codeforces;

import java.util.Scanner;

public class UltraFastMathematician_61A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < a.length(); i++)
        {
            if (a.charAt(i) != b.charAt(i)) {
                res.append(1);
            }
            else {
                res.append(0);
            }
        }
        System.out.println(res);

//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        System.out.println(a ^ b);
    }
}
