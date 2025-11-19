package test1;

import java.util.Scanner;

public class SquareRoot {

     public static void main(String[] args)
     {
         Scanner scan = new Scanner(System.in);
         int n = scan.nextInt();

         int low = 0 , high = n;

         while (low <= high)
         {
             int mid = (low + high) /2;
             if(mid * mid == n)
             {
                 System.out.println(mid);
                 return;
             }

             else if(mid * mid > n)
             {
                 high = mid - 1;
             }
             else
             {
                 low = mid + 1;
             }
         }
         System.out.println(high);
     }
}
