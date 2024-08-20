package codeforces;

import java.util.Scanner;

public class BuyAShovel_732A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int oneShovelPrice = sc.nextInt();
        int extraChangeCoin = sc.nextInt();

        int shovelCount = 1;


        while ((shovelCount * oneShovelPrice) % 10 != extraChangeCoin &&
                (shovelCount * oneShovelPrice) % 10 != 0) {
            shovelCount++;
        }

        System.out.println(shovelCount);
    }
}