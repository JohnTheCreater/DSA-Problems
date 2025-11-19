package binary_search;

public class Peak {


    public static void main(String[] args)
    {
        int[] arr = {1,2,4,5,6,8,12,3};

        int low = 0 , high = arr.length -1;

        while(low <= high)
        {
            int mid = low + (high - low ) / 2;
            if(arr[mid] > arr[high] && arr[mid+1] < arr[mid])
            {
                high = mid;
            }
            else
            {
                low = mid + 1;
            }
        }
        System.out.println(arr[high] +" at " + high);
    }



}
