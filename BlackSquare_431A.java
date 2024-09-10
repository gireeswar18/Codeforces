package codeforces;

import java.util.Scanner;

public class BlackSquare_431A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int one = sc.nextInt();
        int two = sc.nextInt();
        int three = sc.nextInt();
        int four = sc.nextInt();

        String str = sc.next();
        int total = 0;

        for (char c : str.toCharArray()) {

            switch (c) {
                case '1':
                    total += one;
                    break;
                case '2':
                    total += two;
                    break;
                case '3':
                    total += three;
                    break;
                default:
                    total += four;
            }
        }

        System.out.println(total);
    }
}
