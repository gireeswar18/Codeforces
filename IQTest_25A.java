package codeforces;

import java.util.Scanner;

public class IQTest_25A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int firstOdd = -1;
        int firstEven = -1;
        int oddCount = 0;
        int evenCount = 0;
        boolean oddFlag = true, evenFlag = true;

        for (int i = 0; i < n; i++)
        {
            int num = arr[i];
            if (num % 2 == 0)
            {
                if (evenFlag)
                {
                    firstEven = i;
                    evenFlag = false;
                }
                evenCount++;
            }
            else
            {
                if (oddFlag)
                {
                    firstOdd = i;
                    oddFlag = false;
                }
                oddCount++;
            }
        }

        if (oddCount == 1)
            System.out.println(firstOdd + 1);
        else
            System.out.println(firstEven + 1);
    }
}
