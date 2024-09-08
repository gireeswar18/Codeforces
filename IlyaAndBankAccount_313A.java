package codeforces;

import java.util.Scanner;

public class IlyaAndBankAccount_313A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int val = sc.nextInt();

        if (val > 0)
            System.out.println(val);
        else {
            int lastRemoved;
            int beforeLastRemoved;

            lastRemoved = val / 10;
            beforeLastRemoved = (val / 100) * 10 + (val % 10);

//            System.out.println("Last Removed: " + lastRemoved);
//            System.out.println("Before last removed: " + beforeLastRemoved);

            System.out.println(Math.max(lastRemoved, beforeLastRemoved));
        }
    }
}