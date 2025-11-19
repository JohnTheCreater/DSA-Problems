package dp;

import java.util.Scanner;

public class MinToMakeStringEqual {

    public static  void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(getMinOperation(str.toCharArray()));
    }

    private static int getMinOperation(char[] arr) {
        if(isAllEqual(arr))  return 0;
        String firstCase = "",secondCase = "";
        for(int i = 0 ; i < arr.length ; i++)
        {
            if( i%2 == 0) firstCase +=arr[i];
            else secondCase += arr[i];
        }
        return Math.min(getMinOperation(firstCase.toCharArray()) ,getMinOperation(secondCase.toCharArray())) +1;
    }

    private static boolean isAllEqual(char[] arr) {
        if(arr.length == 1) return true;
        for(int i = 1 ; i < arr.length ; i++)
        {
            if(arr[i] != arr[i-1]) return false;
        }
        return true;
    }

}
