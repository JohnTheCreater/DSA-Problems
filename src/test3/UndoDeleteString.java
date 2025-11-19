package test3;

import java.util.Objects;
import java.util.Scanner;

public class UndoDeleteString {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] arr = new String[n];
        for(int i = 0 ; i < n; i++)
        {
            arr[i] = scan.next();
        }
        int stackPtr = -1;
        String[] stack = new String[n];
        int trashPtr = -1;
        String[] trash = new String[n];

        for(String input : arr)
        {
            if(input.equals("#"))
            {
                if(stackPtr != -1)
                    trash[++trashPtr] = stack[stackPtr--];
            }
            else if(input.equals("*"))
            {
                if(trashPtr != -1 && stackPtr < n-1)
                    stack[++stackPtr] = trash[trashPtr--];
            }
            else
            {
                stack[++stackPtr] = input;
            }
        }

        for (int i = 0 ; i <= stackPtr ; i++)
            System.out.print(stack[i]);
    }
}
