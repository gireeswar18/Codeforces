package codeforces;

import java.util.Scanner;

public class SoftDrinking_151A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int noOfFriends = sc.nextInt();
        int bottleCount = sc.nextInt();
        int bottleCapacity = sc.nextInt();
        int limeCount = sc.nextInt();
        int sliceCount = sc.nextInt();
        int saltInGrams = sc.nextInt();
        int drinkNeeded = sc.nextInt();
        int saltNeeded = sc.nextInt();

        int totalCapacity = (bottleCount * bottleCapacity) / drinkNeeded;
        int slicePieces = limeCount * sliceCount;
        int salt = saltInGrams / saltNeeded;

//        System.out.println(totalCapacity + " " + slicePieces + " " + salt);

        System.out.println(Math.min(totalCapacity, Math.min(slicePieces, salt)) / noOfFriends);


        // 3 4 5 10 8 100 3 1
        /*
            3 friends
            4 bottle
            5ml capacity
            4 * 5 => 20 ml

            10 limes
            10 * 8 => 80 slices

            100g salt

            each friend 3 ml
            salt 1g
         */
    }

}
