package binary_search;

import java.util.Scanner;

public class RotatedSorted {
    public static  void main(String[] args)
    {
        int[] arr = {4,5,6,7,0,1,2};
        Scanner scan  = new Scanner(System.in);
        int target = scan.nextInt();
        int low = 0 , high = arr.length-1;

        while(low <= high)
        {
            int mid = (low + high ) /2;
            if(arr[mid] ==  target)
            {
                System.out.println("Found in :"+mid);
                return;
            }
            else if(arr[low] < arr[mid])
            {
                if(target < arr[mid] && arr[low] <= target)
                {
                    high = mid -1;
                }
                else
                {
                    low = mid + 1;
                }
            }
            else
            {
                if(target > arr[mid] && target <= arr[high])
                {
                    low = mid + 1;
                }
                else
                {
                    high = mid - 1;
                }
            }
        }
        System.out.println(-1);
    }
}
