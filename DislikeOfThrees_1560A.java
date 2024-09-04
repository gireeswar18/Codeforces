package codeforces;

import java.util.Scanner;

public class DislikeOfThrees_1560A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {
            int num = sc.nextInt();

            int start = 0;
            while (num != 0) {
                start++;
                if (start % 3 == 0 || start % 10 == 3)
                    continue;
                num--;
            }

            System.out.println(start);
        }
    }
}
