package test;

public class CyclicSort {
    public static void main(String[] args) {


        int[] arr = {3,5,2,1,4};
        cyclicSort(arr);
        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
    public static void  cyclicSort(int[] arr)
    {

        int i = 0 ;
         while(i < arr.length)
         {
             if(arr[i] != arr[arr[i]-1])
             {
                 int t = arr[arr[i]-1];
                 arr[arr[i]-1] = arr[i];
                 arr[i] = t;
             }
             else i++;
         }

    }
}
