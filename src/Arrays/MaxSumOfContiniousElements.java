package Arrays;

public class MaxSumOfContiniousElements {

    public static void main(String[] args)
    {
        int ptr = 0 , maxPtr = -1;
        int sum = 0 , maxSum = 0;
        int[] arr = {-8,11,15,-10,12,17,19,-1};
        boolean flag = true;

        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] < 0)
            {
                if( sum != 0 )
                {
                    if(sum > maxSum)
                    {
                        maxSum = sum;
                        maxPtr = ptr;
                    }
                    sum = 0;

                }

                continue;
            }
            if( sum == 0 ) ptr = i;
            sum += arr[i];

        }
        System.out.println("Max sum = "+maxSum);
        System.out.print("Max Elements: [ ");
        for(int i = maxPtr ; i < arr.length ; i++)
        {
            if(arr[i] < 0 ) break;
            System.out.print(arr[i] +" ");
        }
        System.out.print(" ]");
    }


}
