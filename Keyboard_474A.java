package codeforces;

import java.util.*;

public class Keyboard_474A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Character> q = new ArrayList<>(
                Arrays.asList('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'));
        ArrayList<Character> a = new ArrayList<>(
                Arrays.asList('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', ';'));
        ArrayList<Character> z = new ArrayList<>(
                Arrays.asList('z', 'x', 'c', 'v', 'b', 'n', 'm', ',', '.', '/'));

        char c = sc.next().charAt(0);

        String str = sc.next();
        StringBuilder sb = new StringBuilder();

        if (c == 'L') {
            for (char x : str.toCharArray()) {
                if (q.contains(x)) {
                    int ind = q.indexOf(x);
                    sb.append(q.get(ind + 1));
                }
                else if (a.contains(x)) {
                    int ind = a.indexOf(x);
                    sb.append(a.get(ind + 1));
                }
                else {
                    int ind = z.indexOf(x);
                    sb.append(z.get(ind + 1));
                }
            }
        }
        else {
            for (char x : str.toCharArray()) {
                if (q.contains(x)) {
                    int ind = q.indexOf(x);
                    sb.append(q.get(ind - 1));
                }
                else if (a.contains(x)) {
                    int ind = a.indexOf(x);
                    sb.append(a.get(ind - 1));
                }
                else {
                    int ind = z.indexOf(x);
                    sb.append(z.get(ind - 1));
                }
            }
        }

        System.out.println(sb);
    }
}
