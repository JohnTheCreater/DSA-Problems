package Arrays;

import java.util.Scanner;

public class ReverseKElements {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int[] arr = {2, 1 , 3 , 5 , 8 , 6 , 7 , 9};
        int start = 0;
        int n = arr.length;

        for(int i = 0 ; i < n ; i++)
        {
            if( i % k == 0)  start = i;


            int end = start + k <= n ? (start + k) - (i - start) - 1 : n - (i - start) - 1;

            if( i < end) {
                int t = arr[i];
                arr[i] = arr[end];
                arr[end] = t;
            }

        }

        for (int num : arr)
            System.out.print(num + " ");


    }
}
