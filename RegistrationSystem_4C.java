package codeforces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RegistrationSystem_4C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {

            String name = sc.next();

            if (map.containsKey(name)) {
                String newName = name + map.get(name);
                map.put(name, map.get(name) + 1);
                map.put(newName, 1);
                System.out.println(newName);
            }
            else {
                map.put(name, 1);
                System.out.println("OK");
            }
        }
    }
}
