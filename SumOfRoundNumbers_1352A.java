package codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfRoundNumbers_1352A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {

            int num = sc.nextInt();
            int count = 0;
            List<Integer> list = new ArrayList<>();

            while (num != 0) {

                int q;

                if (num >= 1000) {
                    q = num / 1000;
                    num = num % 1000;

                    count++;
                    list.add(q * 1000);
                }
                else if (num >= 100) {
                    q = num / 100;
                    num = num % 100;

                    count++;
                    list.add(q * 100);
                }
                else if (num >= 10) {
                    q = num / 10;
                    num = num % 10;

                    count++;
                    list.add(q * 10);
                }
                else {
                    count++;
                    list.add(num);
                    num = 0;
                }

            }

            System.out.println(count);
            for(int x : list) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
// 5009 > 1000
/*
    -> 5 q
    -> 5 * 1000
    -> rem
 */

/*
    7
    -> < 10 return 1
 */

/*
    9876
    -> 9876 > 1000
    -> 9 q
    -> 9 * 1000
    -> rem 876
            -> 8 q
            -> 8 * 100
            -> rem 76
 */