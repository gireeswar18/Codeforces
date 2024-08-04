package codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class GravityFlip_405A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        mergeSort(arr, 0, n - 1);

        for (int x : arr)
        {
            System.out.print(x + " ");
        }
    }

    public static int mergeSort (int[] arr, int low, int high)
    {
        int count = 0;
        if (low >= high)
            return count;

        int mid = (low + high) / 2;

        count += mergeSort(arr, low, mid);
        count += mergeSort(arr, mid + 1, high);

        count += merge(arr, low, mid, high);

        return count;
    }

    public static int merge (int[] arr, int low, int mid, int high) {

        int i = low;
        int j = mid + 1;
        ArrayList<Integer> res = new ArrayList<>();
        int count = 0;
        int index = 0;

        while (i <= mid && j <= high)
        {
            if (arr[i] <= arr[j])
            {
                res.add(arr[i]);
                i++;
            }
            else
            {
                res.add(arr[j]);
                j++;
                count = mid - i + 1;
            }
        }

        while (i <= mid) {
            res.add(arr[i]);
            i++;
        }
        while (j <= high) {
            res.add(arr[j]);
            j++;
        }

        for (int k = low; k <= high; k++)
        {
            arr[k] = res.get(index);
            index++;
        }

        return count;
    }

}
