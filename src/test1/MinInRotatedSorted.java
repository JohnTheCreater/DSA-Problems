package test1;

public class MinInRotatedSorted {

    public static  void main(String[] args)
    {
        int[] arr = {4,1};

        int low = 0 , high = arr.length-1;
        int min = Integer.MAX_VALUE;
        while(low <= high)
        {
            int mid = (low+high) / 2;
            if(arr[mid] < min) min = arr[mid];
            if(arr[low] < arr[mid])
            {
                if(arr[low] < min) min = arr[low];
                low = mid + 1;
            }
            else
            {
                if(arr[mid] < min) min = arr[mid];
                high = mid - 1;
            }
        }
        System.out.println(min);
    }
}
