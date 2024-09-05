package codeforces;

import java.util.*;

public class TeamOlympiad_490A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int studentCount = sc.nextInt();

        List<Integer> ones = new ArrayList<>();
        List<Integer> twos = new ArrayList<>();
        List<Integer> threes = new ArrayList<>();

        int[] arr = new int[studentCount];

        for (int i = 0; i < studentCount; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] == 1)
                ones.add(i + 1);
            else if (arr[i] == 2)
                twos.add(i + 1);
            else
                threes.add(i + 1);
        }

//        System.out.println("One size: " + ones.size());
//        System.out.println(ones);
//        System.out.println("Two size: " + twos.size());
//        System.out.println(twos);
//        System.out.println("Three size: " + threes.size());
//        System.out.println(threes);

        int teams = Math.min(ones.size(), Math.min(twos.size(), threes.size()));

        System.out.println(teams);

        for (int i = 0; i < teams; i++) {
            System.out.println(ones.get(i) + " " + twos.get(i) + " " + threes.get(i));
        }
    }
}
