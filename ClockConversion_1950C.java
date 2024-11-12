package codeforces;

import java.util.Scanner;

public class ClockConversion_1950C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            String time = sc.next();

            int hours = Integer.parseInt(time.substring(0, 2));
            int mins = Integer.parseInt(time.substring(3, 5));

            String meridiem = hours >= 12 ? "PM" : "AM";

            StringBuilder res = new StringBuilder();

            if (hours > 12) {
                res.append(hours % 12);

                if (hours % 12 < 10) {
                    res.insert(0, 0);
                }
            }
            else {
                if (hours == 0) {
                    res.append("12");
                }
                else if (hours < 10) {
                    res.append(0).append(hours);
                }
                else {
                    res.append(hours);
                }
            }
            res.append(':');

            if (mins < 10) {
                res.append(0);
            }
            res.append(mins);

            res.append(' ').append(meridiem);

            System.out.println(res);
        }
    }
}
