package test;

public class FindAndSortFibanacci {

    public static void main(String[] args)
    {
        int[] arr = {1,9,3,3,1,-8,34,21,3,55,63,4,5,6,34,4,8,8,0,3,6,24,2,4};
//        int[] arr = {-1,-3,-4,-2,-4,-21,-4,-1,4};
        int max = findMax(arr);
        if(max < 0) return;
        int[] hash = new int[max+1];
        int x = 0 ;
        int y = 1 ;
        hash[0] = 1;
        hash[1] = 1;
        while ( x+y <= max )
        {
            hash[x+y] = 1;
            int t = x;
            x = y;
            y = t+y;
        }

        for (int j : arr) {

            if (j < 0) continue;

            if (hash[j] == 1)
                hash[j] = 2;
        }
        for(int i = 0 ; i < hash.length ; i++)
        {
            if(hash[i] == 2)
                System.out.print(i +" ");
        }



    }

    private static int findMax(int[] arr) {

        int max = -1;
        for (int j : arr) {
            if (j > max)
                max = j;
        }
        return max;

    }
}
