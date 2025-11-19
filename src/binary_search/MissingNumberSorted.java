package binary_search;

public class MissingNumberSorted {

    public static  void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6};

        int low = 0 , high = arr.length - 1;
        while(low <= high)
        {
            int mid = (low+high) / 2;
            if(arr[mid] %2 == 0)
            {
                if(mid %2 != 0)
                {
                    low = mid + 1;
                }
                else
                {
                    high = mid -1;
                }
            }
            else
            {
                if(mid%2 == 0)
                {
                    low = mid + 1;
                }
                else
                {
                    high = mid - 1;
                }
            }
        }
        if(low >= arr.length)
        {
            System.out.println(arr[arr.length-1] +1);
            return;
        }
        System.out.println(arr[low]-1);
    }
}
