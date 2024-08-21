package codeforces;

import java.util.Scanner;

public class VasyaTheHipster_581A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int redSock = sc.nextInt();
        int blueSock = sc.nextInt();

        int hipsterDays = 0;
        int normalDays = 0;

        while (redSock != 0 && blueSock != 0){
            redSock--;
            blueSock--;
            hipsterDays++;
        }

        while (redSock > 1) {
            redSock -= 2;
            normalDays++;
        }

        while (blueSock > 1) {
            blueSock -= 2;
            normalDays++;
        }

        System.out.println(hipsterDays + " " + normalDays);
    }
}
