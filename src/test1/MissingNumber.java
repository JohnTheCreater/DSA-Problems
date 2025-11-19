package test1;

public class MissingNumber {

    public static void main(String[] args)
    {
        int[]arr = {1,0};

        int sum = 0 ;
        for(int num : arr)
        {
            sum += num;
        }
        int n = arr.length;
        System.out.println( n * (n+1) / 2 - sum);
    }
}
