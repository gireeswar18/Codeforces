package codeforces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RudolfAndTheTicket_1941A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int k = sc.nextInt();

            int[] left = new int[l];
            int[] right = new int[r];

            for (int i = 0; i < l; i++) {
                left[i] = sc.nextInt();
            }
            for (int i = 0; i < r; i++) {
                right[i] = sc.nextInt();
            }

            Map<Integer, Integer> map = new HashMap<>();

            for (int num : left) {
                if (num < k)
                    map.put(k - num, map.getOrDefault(k - num, 0) + 1);
            }

            int res = 0;

            for (int num : right) {
                for (int key : map.keySet()) {
                    if (key >= num) {
                        res += map.get(key);
                    }
                }
            }

            System.out.println(res);
        }
    }
}
