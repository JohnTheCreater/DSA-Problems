package test1;

import java.util.Scanner;

public class MaximumSubArraySum {

    public static void main(String[] args)
    {
        int[] arr = {-2,-4,-10,-20};

        int sum = 0 , max = Integer.MIN_VALUE;

        for(int num : arr)
        {
            sum += num;
            if(sum > max)
                max = sum;
            if(sum < 0)
            {
                sum = 0;
            }

        }
        System.out.println(max);


    }
}
