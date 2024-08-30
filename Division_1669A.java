package codeforces;

import java.util.Scanner;

public class Division_1669A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {
            int rating = sc.nextInt();

            if (rating >= 1900)
                System.out.println("Division 1");
            else if (rating >= 1600 && rating <= 1899)
                System.out.println("Division 2");
            else if (rating >= 1400 && rating <= 1599)
                System.out.println("Division 3");
            else
                System.out.println("Division 4");
        }
    }
}
//For Division 1: 1900≤rating
//For Division 2: 1600≤rating≤1899
//For Division 3: 1400≤rating≤1599
//For Division 4: rating≤1399