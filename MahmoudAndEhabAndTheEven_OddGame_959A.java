package codeforces;

import java.util.Scanner;

public class MahmoudAndEhabAndTheEven_OddGame_959A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n % 2 == 0)
            System.out.println("Mahmoud");
        else
            System.out.println("Ehab");
    }
}
