package sorting;

import java.util.Scanner;

public class StableSort {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        int[] p = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = scan.nextInt();
            p[i] = findNumberOfPrimeFactors(arr[i]);
        }

        for(int i = 0 ; i < n ; i++)
        {
            for(int j = i + 1 ; j < n ; j++)
            {
                if(p[i] > p[j] || (p[i] == p[j] && sumOf(arr[i]) > sumOf(arr[j])))
                {
                    int t = p[i];
                    p[i] = p[j];
                    p[j] = t;

                    t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }


            }
        }
        for(int i = 0 ; i < n ; i++) System.out.print(arr[i] +" ");



    }

    private static int sumOf(int num) {
        int sum = 0 ;
        while(num > 0 )
        {
            sum += num%10;
            num /=10;
        }
        return sum;
    }

    private static int findNumberOfPrimeFactors(int num) {

        int count = 0;
        for(int i = 2 ;  i  * i <= num ;i++ )
        {
            if(num % i == 0 ) {
                if (isPrime(i))
                    count++;
                int pair = num / i;
                if (pair != i && isPrime(pair)) count++;
            }

        }
        return count;
    }

    private static boolean isPrime(int i) {

        if( i <=  1) return false;

        for(int j = 2 ; j * j <= i ; j++ )
        {
            if( i % j == 0 ) return false;
        }
        return true;

    }
}
