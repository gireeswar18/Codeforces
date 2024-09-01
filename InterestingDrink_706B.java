package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class InterestingDrink_706B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfShops = sc.nextInt();

        int[] priceInShop = new int[numberOfShops];
        for (int i = 0; i < numberOfShops; i++)
            priceInShop[i] = sc.nextInt();

        int consDays = sc.nextInt();

        int[] eachDay = new int[consDays];
        for (int i = 0; i < consDays; i++)
            eachDay[i] = sc.nextInt();

        Arrays.sort(priceInShop);

        for (int i = 0; i < consDays; i++) {
            int targetPrice = eachDay[i];

            int start = 0;
            int end = numberOfShops - 1;
            int result = 0;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (priceInShop[mid] <= targetPrice) {
                    result = mid + 1;
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

            System.out.println(result);
        }
    }
}
