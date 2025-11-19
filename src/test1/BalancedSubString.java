package test1;

import java.util.Scanner;

public class BalancedSubString {

    public static  void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int rCount = 0,lCount = 0;
        int count = 0;
        for(int i = 0 ; i < str.length() ; i++)
        {
            for(int j = i ; j < str.length() ; j++)
            {
                if(str.charAt(j) == 'R')
                {
                    rCount++;
                }
                else
                {
                    lCount++;
                }
                if(rCount == lCount)
                {
                    count++;
                    i = j;
                    break;
                }
            }
            rCount = 0;
            lCount = 0;
        }
        System.out.println(count);
    }
}
