package codeforces;

import java.util.Scanner;

public class ChatRoom_58A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int ind = 0;
        String hello = "hello";

        for (char c : str.toCharArray()) {
            if (ind == 5) break;

            if (c == hello.charAt(ind))
                ind++;
        }

        System.out.println(ind == 5 ? "YES" : "NO");

    }
}
