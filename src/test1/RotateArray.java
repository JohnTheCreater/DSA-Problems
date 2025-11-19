package test1;

import java.util.Scanner;

public class RotateArray {

    public static  void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6,7};
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();

        int n = arr.length;

        k = k%n;
        for(int i = 0 ; i < k ; i ++)
        {
            int t = arr[n-1];
            for(int j = n-2; j >= 0 ; j--)
            {
                arr[j+1] =  arr[j];
            }
            arr[0] = t;

        }
        for(int num :arr)
        {
            System.out.print(num +" ");
        }
    }
}
