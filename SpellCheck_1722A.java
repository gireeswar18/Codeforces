package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class SpellCheck_1722A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {
            int len = sc.nextInt();

            String str = sc.next();

            if (len != 5) {
                System.out.println("no");
                continue;
            }

            int[] arr = new int[5];

            Arrays.fill(arr, 1);

            for (char c : str.toCharArray()) {

                switch (c) {
                    case 'T': {
                        arr[0]--;
                        break;
                    }
                    case 'i': {
                        arr[1]--;
                        break;
                    }
                    case 'm': {
                        arr[2]--;
                        break;
                    }
                    case 'u': {
                        arr[3]--;
                        break;
                    }
                    case 'r': {
                        arr[4]--;
                    }

                }
            }
            boolean res = true;

            for (int i : arr)
                if (i != 0) {
                    res = false;
                    break;
                }

            System.out.println(res ? "yes" : "no");
        }

    }
}
