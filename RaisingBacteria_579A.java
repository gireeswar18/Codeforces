package codeforces;

import java.util.Scanner;

public class RaisingBacteria_579A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();

        int bacteria = 1;
        int minBacteria = 0;
        int producedBacteria = 0;

        while (total != 0) {

            minBacteria++;

            while(bacteria * 2 <= total)
                bacteria = bacteria * 2;

            producedBacteria += bacteria;
            total -= bacteria;
            bacteria = 1;

        }
        System.out.println(minBacteria);
    }
}
