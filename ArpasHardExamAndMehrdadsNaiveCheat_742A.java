package codeforces;

import java.util.Scanner;

public class ArpasHardExamAndMehrdadsNaiveCheat_742A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n == 0) {
            System.out.println(1);
            return;
        }

        int[] lastDigit = {8, 4, 2, 6};

        int pos = n % 4 - 1;

        System.out.println(pos == -1 ? 6 : lastDigit[pos]);
    }
}
