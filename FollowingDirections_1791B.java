package codeforces;

import java.util.Scanner;

public class FollowingDirections_1791B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {
            int n = sc.nextInt();
            String str = sc.next();
            int x = 0;
            int y = 0;
            boolean flag = false;

            for (char c : str.toCharArray()) {

                if (c == 'U') {
                    y += 1;
                }
                else if (c == 'D') {
                    y -= 1;
                }
                else if (c == 'L') {
                    x -= 1;
                }
                else {
                    x += 1;
                }

                if (!flag && x == 1 && y == 1)
                    flag = true;

            }

            System.out.println(flag ? "Yes" : "No");
        }
    }
}
