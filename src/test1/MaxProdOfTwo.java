package test1;

public class MaxProdOfTwo {

    public static  void  main(String[] args)
    {
        int[] arr = {3,4,5,2,10,9};

        int max = -1;
        int sec = -1;

        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] > max)
            {
                sec = max;
                max = arr[i];
            }
            else if(arr[i] > sec)
            {
                sec = arr[i];
            }
        }
        System.out.println((max-1) * (sec-1));
    }
}
