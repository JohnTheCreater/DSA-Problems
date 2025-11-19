package test4;

import java.util.Scanner;

public class CustomSort {


    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
            arr[i] = scanner.nextInt();

        for(int i = 0 ; i < n ; i++)
        {
            if(arr[i] % 2 != 0)
            {
                for (int j = i+1 ; j < n ; j++)
                {
                    if(arr[j] % 2 != 0 && arr[j] < arr[i])
                    {
                        int t = arr[i];
                        arr[i] = arr[j];
                        arr[j] = t;
                    }
                }
            }
        }

        for(int i = 0 ; i < n ; i++)
        {
            if(arr[i] % 2 == 0)
            {
                for (int j = i+1 ; j < n ; j++)
                {
                    if(arr[j] % 2 == 0 && arr[j] > arr[i])
                    {
                        int t = arr[i];
                        arr[i] = arr[j];
                        arr[j] = t;
                    }
                }
            }
        }
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i] +" ");
        }


    }
}
