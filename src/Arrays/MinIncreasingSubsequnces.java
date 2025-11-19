package Arrays;

import java.util.Scanner;
import java.util.Stack;

public class MinIncreasingSubsequnces {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n  = scanner.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i  < n ; i++ )
            arr[i] = scanner.nextInt();

        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[n];
        int count = 0;
        for(int i = 0 ; i < n ; i++)
        {
            if(!visited[i]) {
                for (int j = 0; j < n; j++) {
                    if (!visited[j]) {
                        while (!stack.isEmpty() && arr[stack.peek()] < arr[j])
                            stack.pop();
                        stack.push(j);
                    }
                    System.out.println(stack.toString());
                }
                while (!stack.isEmpty()) visited[stack.pop()] = true;
                count++;
                i=-1;
            }

        }
        System.out.println(count);
    }
}
