package dp.memo;


import java.util.HashMap;
import java.util.Map;

public class MinCoins {
    public static void main(String[] args)
    {
        int[] coins = {1,2,6,5};
        int amount = 4;

        System.out.println(minCoins(coins,amount,new HashMap<>()));
    }

    private static int minCoins(int[] coins, int amount, Map<Integer,Integer> memo) {
        if(amount == 0) return 0;
        if(memo.containsKey(amount)) return memo.get(amount);
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < coins.length; i++ )
        {
            if(coins[i] <= amount)
            {
                int c = minCoins(coins,amount-coins[i],memo);
                if(c!=-1)
                    min = Math.min(min,c + 1);
            }
        }
        memo.put(amount, min == Integer.MAX_VALUE ? -1 : min);
        return min == Integer.MAX_VALUE ? -1 : min ;

    }
}
