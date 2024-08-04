package codeforces;

import java.util.*;

public class Taxi_158B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] arr = new int[num];

        for (int i = 0; i < num; i++)
        {
            arr[i] = sc.nextInt();
        }

        int cars = 0;
        int ones = 0;
        int twos = 0;
        int threes = 0;

        for (int x : arr)
        {
            switch(x) {
                case 1:
                    ones++;
                    break;
                case 2:
                    twos++;
                    break;
                case 3:
                    threes++;
                    break;
                default:
                    cars++;
            }
        }
        cars += twos / 2;
        twos %= 2;

        System.out.println("Number of ones: " + ones);
        System.out.println("Number of twos: " + twos);
        System.out.println("Number of threes: " + threes);
        System.out.println("Number of cars: " + cars);

        if (twos == 1 && ones >= 2)
        {
            cars++;
            twos--;
            ones -= 2;
        }
        System.out.println("After joining one with twos-----");
        System.out.println("Number of ones: " + ones);
        System.out.println("Number of twos: " + twos);
        System.out.println("Number of threes: " + threes);
        System.out.println("Number of cars: " + cars);


        while (threes != 0 && ones != 0)
        {
            cars++;
            threes--;
            ones--;
        }

        System.out.println("After joining three with ones-----");
        System.out.println("Number of ones: " + ones);
        System.out.println("Number of twos: " + twos);
        System.out.println("Number of threes: " + threes);
        System.out.println("Number of cars: " + cars);


        if (threes != 0)
        {
            cars += threes;
            threes = 0;
        }

        while (ones >= 4)
        {
            cars += ones / 4;
            ones %= 4;
        }

        if (twos == 1 && ones >= 2)
        {
            twos--;
            ones -= 2;
            cars++;
        }

        if (twos == 1 && ones == 1)
        {
            twos--;
            ones -= 1;
            cars++;
        }

        if (twos == 1)
        {
            cars++;
        }

        if (ones != 0)
        {
            cars++;
            ones = 0;
        }
        System.out.println("----------");
        System.out.println("Number of ones: " + ones);
        System.out.println("Number of twos: " + twos);
        System.out.println("Number of threes: " + threes);


        System.out.println(cars);

    }
}