package Arrays;


import java.util.Arrays;

public class WaveFormat {

    public static  void main(String[] args)
    {
        int[] arr = {10,2,34,2,0,13,1,6,3,50,58};
        // sortAndFormat(arr); // O(n log n)
        greedy(arr); // O(n)
        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.print( arr[i] +" ");
        }
    }

    static void sortAndFormat(int[] arr)
    {
        Arrays.sort(arr);

        for(int i = 0 ; i < arr.length - 1; i++)
        {
            if(i % 2 == 0)
            {
                int t = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = t;
            }
        }

    }

    static void greedy (int[] arr)
    {
        if(arr.length < 3) return;
        boolean isUp = arr[0] < arr[1];

        for(int i = 2 ; i < arr.length-1; i++)
        {
            if(isUp)
            {
                if(arr[i] > arr[i+1]) {
                    int t = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = t;
                }

            }
            else
            {
                if(arr[i] < arr[i+1])
                {
                    int t = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = t;
                }
            }
            isUp = !isUp;
        }
    }
}
