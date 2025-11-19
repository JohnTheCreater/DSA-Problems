package test4;

import java.util.Scanner;

public class NextGreater {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
            arr[i] = scanner.nextInt();

        for(int i = 0 ; i < n ; i++)
        {
            int nextGreater = -1;
            for(int j = i+1; j < n ; j++)
            {
                if(arr[j] > arr[i])
                {
                    if(nextGreater == -1 || arr[j] < nextGreater)
                        nextGreater = arr[j];
                }
            }
            arr[i] = nextGreater;
        }
        for(int i = 0 ; i < n ; i++)
            System.out.print(arr[i] +" ");
    }
}
