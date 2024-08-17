package codeforces;

import java.util.Scanner;

public class PoliceRecruits_427A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int p = 0;
        int crimes = 0;

        for (int i = 0; i < n; i++) {

            int event = sc.nextInt();

            System.out.println("Event: " + event);

            if (event > 0) {
                p += event;
            }

            else {
                crimes++;

                if (p != 0) {
                    crimes--;
                    p--;
                }
            }
            System.out.println("Crimes: " + crimes);
            System.out.println("Free Police: " + p);
            System.out.println("------------------");
        }

        System.out.println(crimes);
    }
}
