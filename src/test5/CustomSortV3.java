package test5;

import com.sun.jdi.IntegerType;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class CustomSortV3 {


    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
            arr[i] = scanner.nextInt();
        Map<Integer, Integer> factorMap = new HashMap<>();
        Map<Integer,Integer> sumMap = new HashMap<>();

        for(int i = 0 ; i < n ; i++)
        {
            if(!factorMap.containsKey(arr[i]))
            {
                factorMap.put(arr[i],getPrimeFactorCount(arr[i]));
            }
        }

        for(int i = 0 ; i < n ; i++)
        {
            if(!sumMap.containsKey(arr[i]))
            {
                sumMap.put(arr[i],getSumOfDigits(arr[i]));
            }
        }

        sort(arr,factorMap,sumMap);
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i] +" ");
        }

    }

    private static Integer getSumOfDigits(int num) {
        int sum = 0 ;
        while(num >  0)
        {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    private static Integer getPrimeFactorCount(int num) {

        int count = 1 - (num % 2);
        while (num % 2 == 0) num /= 2;
        for(int i = 3; i <= num ; i+=2 )
        {
            if(num % i == 0) count++;
            while(num != 0 && num % i == 0) num /= i;

        }
        return count;

    }
    private static boolean isPrime(int num)
    {
        if(num <= 1) return false;
        for(int i = 2  ; i * i <= num ; i++ )
        {
            if(num % i == 0) return false;
        }
        return true;
    }

    public static void sort(int[] arr,Map<Integer,Integer> factorMap,Map<Integer,Integer> sumMap)
    {
        int n = arr.length;
        for(int i = 0 ; i < n ; i ++)
        {
            for(int j = 0; j < n-i-1 ; j++)
            {
                if(factorMap.get(arr[j]) < factorMap.get(arr[j+1]) ||
                        (Objects.equals(factorMap.get(arr[j]), factorMap.get(arr[j + 1])) && sumMap.get(arr[j]) < sumMap.get(arr[j+1])))
                {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
    }
}
