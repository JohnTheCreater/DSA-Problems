package test2;

public class NearestNumber {

    public static void main(String[] args)
    {
        int[] arr = {1,3,5,6,7,8,9,10,14,19};
        int x = 16;

        int low = 0, high = arr.length - 1;

        while(low <= high)
        {
            int mid = low + ( high - low) / 2;
            if(arr[mid] == x)
            {
                System.out.println("Target Found in :" + mid);
                return;
            }
            else if(x < arr[mid])
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        int diff1 = x - arr[high];
        int diff2 = arr[low] - x;
        System.out.println("Closest : "+ (diff1 < diff2 ? arr[high] : arr[low]));
    }
}
