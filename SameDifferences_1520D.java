package codeforces;

import java.util.*;

public class SameDifferences_1520D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {

            Map<Integer, Integer> map = new HashMap<>();

            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            long count = 0;

            map.put(arr[0], 1);

            for (int i = 1; i < n; i++) {
                if (map.containsKey(arr[i] - i)) {
                    int val = map.get(arr[i] - i);
                    count += val;
                    map.put(arr[i] - i, val + 1);
                }
                else {
                    map.put(arr[i] - i, 1);
                }
            }

            System.out.println(count);
        }
    }
}
