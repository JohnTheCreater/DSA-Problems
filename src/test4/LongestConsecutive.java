package test4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestConsecutive {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
            arr[i] = scanner.nextInt();
        Set<Integer> set = new HashSet<>();
        for(int i = 0 ; i < n;i++)
            set.add(arr[i]);
        int max = 0;
        for(int i = 0 ; i < n ; i++)
        {

            if(!set.contains(arr[i]+1))
            {
                int count = 0;
                int num = arr[i];
                while(set.contains(num))
                {
                    count++;
                    num--;
                }
                if(count > max) max = count;
            }
        }
        System.out.println(max);
    }
}

