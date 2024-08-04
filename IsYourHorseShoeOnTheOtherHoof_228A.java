package codeforces;

import java.util.HashSet;
import java.util.Scanner;

public class IsYourHorseShoeOnTheOtherHoof_228A {
     public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            HashSet<Integer> hs = new HashSet<>();
            int count = 0;

            int [] inp = new int[4];
            for (int i = 0; i < 4; i++)
            {
                inp[i] = sc.nextInt();
            }

            for (int x : inp)
            {
                if (!hs.add(x))
                {
                    count++;
                }
            }
            System.out.println(count);

        }
}
