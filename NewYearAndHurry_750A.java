package codeforces;

import java.util.Scanner;

public class NewYearAndHurry_750A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfProblems = sc.nextInt();
        int timeToReachParty = sc.nextInt();

        int timeRemaining = 240;
        int timeTaken = 0;

        for (int problem = 1; problem <= numberOfProblems; problem++) {

            timeTaken += problem * 5;

            if (timeRemaining - timeTaken < timeToReachParty) {
                // 235 < 222
                // 240 - 15 -> 225 < 222
                System.out.println(problem - 1);
                return;
            }

        }
        System.out.println(numberOfProblems);
    }
}
