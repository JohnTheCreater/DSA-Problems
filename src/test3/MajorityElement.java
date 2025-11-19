package test3;

import java.util.Scanner;

public class MajorityElement {

    public static  void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++)
        {
            arr[i] = scan.nextInt();
        }
        Integer majority = null;
        int count = 0;

        for(int i = 0 ; i < n ; i++)
        {
            if(count == 0)
            {
                majority = arr[i];
                count = 1;
            }
            else if(arr[i] == majority)
            {
                count++;
            }
            else
            {
                count--;
            }

        }
        System.out.println(majority);
    }
}
