package test1;

import java.util.Scanner;

public class PrintXLargest {

     public static  void main(String[] args)
     {
         int[] arr = {3,5,7};
         Scanner scan = new Scanner(System.in);
         int x = scan.nextInt();

         int max = -1;

         for(int i = 0 ; i < arr.length ; i++)
         {
             if(arr[i] == x)
             {
                 System.out.println(x);
                 return;
             }
             if(arr[i] < x && arr[i] > max)
             {
                 max = arr[i];
             }
         }
         System.out.println(max);
       }
}
