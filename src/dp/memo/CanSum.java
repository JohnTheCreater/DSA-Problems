package dp.memo;

import java.util.HashMap;
import java.util.Map;


public class CanSum {
    public static void main(String[] args)
    {
        int target = 13;
        int[] nums= {2,3};
        System.out.println(canSum(nums,target,new HashMap<>()));
    }

    private static boolean canSum(int[] nums, int target, Map<Integer,Boolean> memo) {
        if(target == 0) return true;
        if(target < 0) return false;
        if(memo.containsKey(target)) return memo.get(target);
        for(int i = 0 ; i < nums.length ; i++)
        {

            if(canSum(nums,target - nums[i], memo))
            {
                memo.put(target,true);
                return true;
            }
        }
        memo.put(target,false);
        return false;
    }
}
