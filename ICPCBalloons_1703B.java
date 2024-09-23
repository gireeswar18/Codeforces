package codeforces;

import java.util.HashSet;
import java.util.Scanner;

public class ICPCBalloons_1703B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {

            int len = sc.nextInt();

            String str = sc.next();
            HashSet<Character> set = new HashSet<>();

            int balloons = 0;

            for (char c : str.toCharArray()) {

                if (set.add(c))
                    balloons += 2;
                else
                    balloons++;
            }

            System.out.println(balloons);
        }
    }
}
