package hash;

import java.util.Scanner;

public class HighestPalindrome {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int n = 0 , t = num;
        int[] freq = new int[10];
        while(t > 0)
        {
            freq[t%10]++;
            t/=10;
            n++;
        }
        int maxOdd = n % 2 == 0 ? 0 : 1;
        int oddCount = 0, middle = -1 ;
        for(int i = 0 ; i < 10 ; i++)
        {
            if(freq[i] % 2 != 0)
            {
                oddCount++;
                if(oddCount > maxOdd)
                {
                    System.out.println("Palindrome cannot be formed");
                    return;
                }
                middle = i;
            }
        }
        int[] arr = new int[n];
        int pt = 0;
        for(int i = 9 ; i >= 0 ; i--)
        {
            if(freq[i] == 0 || freq[i] == 1) continue;
            int c = 0;
            while( c < freq[i] / 2 )
            {
                arr[pt] = i;
                arr[n-pt-1] = i;
                pt++;
                c++;
            }
        }
        if(middle != -1)
        {
            arr[n/2] = middle;
        }
        for(int i = 0 ; i < n ; i++)
            System.out.print(arr[i] );
    }
}
