package test2;

public class TwiceAsLarge {

    public static void main(String[] args)
    {
        int[] arr = {3,4,1,0};

        int max = Integer.MIN_VALUE;
        int secondMax = max;

        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] > max)
            {
                secondMax = max;
                max = arr[i];
            }
            else if(arr[i] > secondMax)
            {
                secondMax = arr[i];
            }
        }

        System.out.println(max >= secondMax * 2);
    }
}
