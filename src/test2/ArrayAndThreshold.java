package test2;

public class ArrayAndThreshold {

    public static void main(String[] args)
    {
        int[] arr = {2,35,22,6,20};
        int thresh = 8;

        int max = Integer.MIN_VALUE;
        String ans = "";
        for(int i = arr.length-1; i >= 0 ;  i-- )
        {
            if(arr[i] > max)
            {
                if(arr[i] >= thresh)
                {
                    ans = " "+ arr[i] + ans;
                }
                max = arr[i];

            }
        }
        System.out.println(ans);

    }
}
