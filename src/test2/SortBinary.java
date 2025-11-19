package test2;

public class SortBinary {

    public static void main(String[] args)
    {
        int[] arr = {0,1,0,1,1,1,0,1,0};

        int oneCount = 0 ;

        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] == 1) oneCount++;

        }

        for(int i = 0 ; i < arr.length ; i++)
        {
            if( i >= arr.length - oneCount)
            {
                arr[i] = 1;
            }
            else
            {
                arr[i] = 0;
            }

        }

        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.print(arr[i]+" ");

        }

    }
}
