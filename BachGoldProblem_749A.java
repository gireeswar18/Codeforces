package codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BachGoldProblem_749A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        if (num % 2 == 1) {
            num -= 3;
            list.add(3);
        }

       while (num != 0) {
           list.add(2);
           num -= 2;
       }

        System.out.println(list.size());

        for (Integer x : list)
            System.out.print(x + " ");

    }
}
