package codeforces.div4.Round_971;

import java.util.Scanner;

public class OsuMania {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- != 0) {
            int rows = sc.nextInt();

            String[] arr = new String[rows];

            for (int i = 0; i < rows; i++) {
                arr[i] = sc.next();
            }

            for (int i = rows - 1; i >= 0; i--) {

                String str = arr[i];

                for (int j = 0; j < 4; j++)
                    if (str.charAt(j) == '#') {
                        System.out.print((j + 1) + " ");
                        break;
                    }
            }
            System.out.println();
        }
    }
}
