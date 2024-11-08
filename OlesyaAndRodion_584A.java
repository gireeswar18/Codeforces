package codeforces;

import java.math.BigInteger;
import java.util.Scanner;

public class OlesyaAndRodion_584A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();

        if (n == 1 && t == 10) {
            System.out.println(-1);
            return;
        }

        BigInteger min = BigInteger.TEN.pow(n - 1);

        BigInteger res = min.add(BigInteger.valueOf(t -
                (min.mod(BigInteger.valueOf(t)).intValue()) % t));
        if (res.compareTo(BigInteger.TEN.pow(n)) < 0) {
            System.out.println(res);
        } else {
            System.out.println(-1);
        }
    }

}
