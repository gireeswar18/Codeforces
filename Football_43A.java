package codeforces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Football_43A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        Map<String, Integer> map = new HashMap<>();

        while (test-- != 0) {

            String team = sc.next();
            map.put(team, map.getOrDefault(team, 0) + 1);

        }

        String winner = "";
        int max = 0;

        for (String team : map.keySet()) {
            if (map.get(team) > max) {
                max = map.get(team);
                winner = team;
            }
        }

        System.out.println(winner);
    }
}
