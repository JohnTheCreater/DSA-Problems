package test3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountSubarraysWithSumK {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
            arr[i] = scan.nextInt();
        int target = scan.nextInt();
        System.out.println(countSubarrays(arr,target));
    }

    private static int countSubarrays(int[] arr, int target) {
        int sum = 0,count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        for(int i = 0 ; i < arr.length ; i++)
        {
            sum += arr[i];
            if(map.containsKey(sum - target))
            {
                count += map.get(sum - target);
            }
            map.put(sum,map.containsKey(sum) ? map.get(sum) + 1 : 1);
        }
        return count;

    }
}
