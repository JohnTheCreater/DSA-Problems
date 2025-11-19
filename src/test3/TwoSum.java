package test3;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = scan.nextInt();
        }
        int target = scan.nextInt();
        Arrays.sort(arr);
        int left = 0 , right = arr.length-1;
        while(left < right)
        {

            int sum = arr[left] + arr[right];
            if(sum == target)
            {
                System.out.println(arr[left] + " + "+ arr[right] +" = "+sum);
                return;
            }
            else if(sum < target)
            {
                left++;
            }
            else
            {
                right--;
            }

        }
        System.out.println("Nothing Found!");


    }
}
