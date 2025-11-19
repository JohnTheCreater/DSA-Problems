package test1;

public class MaximumConsecutiveOnes {

    public  static void main(String[] args)
    {
        int[] nums = {1,1,0,1,1,0,1,1};

        int i = 0 , max = 0 ,count = 0;

        while(i < nums.length)
        {
            while(i < nums.length && nums[i] == 1)
            {
                count++;
                i++;
            }
            if(count > max) max = count;
            count = 0;
            i++;
        }
        System.out.println(max);
    }
}
