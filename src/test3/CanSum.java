package test3;

import java.util.Scanner;

public class CanSum {

    public static  void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
            arr[i] = scan.nextInt();
        int target = scan.nextInt();

        System.out.println(canSum(arr,target,0));

    }

    private static boolean canSum(int[] arr, int target,int ptr) {
        if(target == 0)
        {
            return true;
        }
        for(int i = ptr ; i < arr.length ; i++)
        {
            if(arr[i] <= target && canSum(arr,target-arr[i],i+1)) return  true;
        }
        return false;
    }
}
