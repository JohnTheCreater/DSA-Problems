package Arrays;

public class ConditionSort {

    public static void main(String[] args)
    {
        int[] arr = {3,2,4,1,5};
        int n = arr.length;
        for(int i = 0 ; i < n ; i++)
        {
            if(arr[i] % 2 == 0)
            {
                int maxIndex = i , max = arr[i];
                for(int j = i ; j < n ; j++ )
                {
                    if(arr[j]%2 == 0 && arr[j] > max)
                    {
                        max = arr[j];
                        maxIndex = j;
                    }
                }
                int t = arr[i];
                arr[i] = arr[maxIndex];
                arr[maxIndex] = t;
            }
            else
            {
                int minIndex = i , min = arr[i];
                for(int j = i ; j < n ; j++ )
                {
                    if( arr[j] % 2 != 0 && arr[j] < min)
                    {
                        min = arr[j];
                        minIndex = j;
                    }
                }
                int t = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = t;
            }
        }
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i] +" ");
        }
    }
}
