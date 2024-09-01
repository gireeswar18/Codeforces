package codeforces;

import java.util.Scanner;

public class CheapTravel_466A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalRides = sc.nextInt();
        int ridesPerTicket = sc.nextInt();
        int costOfOneRide = sc.nextInt();
        int costOfOneRideUsingTicket = sc.nextInt();

        int normal = totalRides * costOfOneRide;

        int usingTickets = (totalRides / ridesPerTicket) * costOfOneRideUsingTicket;
        totalRides = totalRides % ridesPerTicket;

        usingTickets = Math.min(usingTickets + (totalRides * costOfOneRide),
                                usingTickets + costOfOneRideUsingTicket);

        System.out.println(Math.min(normal, usingTickets));
    }
}
