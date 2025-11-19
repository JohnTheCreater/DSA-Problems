package test3;

import java.util.Scanner;

public class PalindromeConstruct {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int[] freq = new int[10];

        int t = num ,count = 0;
        while(t > 0)
        {
            freq[t%10]++;
            t/=10;
            count++;
        }
        int allowedOddFrequency = count % 2;

        for(int i = 0 ; i < 10; i++)
        {
            if(freq[i] % 2 != 0)
            {
                if(allowedOddFrequency == 0)
                {
                    System.out.println("false");
                    return;
                }
                allowedOddFrequency--;
            }
        }
        System.out.println("true");
    }
}
