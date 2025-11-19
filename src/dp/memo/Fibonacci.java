package dp.memo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(trifib(n,new HashMap<>()));

    }
    static int fib(int n, Map<Integer,Integer> memo)
    {
        if(n == 0 || n == 1) return n;
        memo.put(n,fib(n-1,memo) + fib(n-2,memo));
        return memo.get(n);
    }

    static int trifib(int n,Map<Integer,Integer> memo)
    {
        if(n==0 || n == 1) return 0;
        if(n == 2) return 1;

        memo.put(n,trifib(n-1,memo) + trifib(n-2,memo) + trifib(n-3,memo));

        return memo.get(n);

    }
}
// t - 5
// 1 2 3
// 1 1 1 1 1
// 1 2 1 1
// 1 2 2
// 2 1 1 1
// 2 2 1
// 2 3
// 3 1 1
// 3 2