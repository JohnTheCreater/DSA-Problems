package test3;

import java.util.*;

public class TargetSum {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ;i++)
            arr[i] = scan.nextInt();
        int target = scan.nextInt();

        Arrays.sort(arr);
        Set<List<Integer>> ans = new HashSet<>();
        findList(arr,0,target,new ArrayList<>(),ans);
        System.out.println(ans);
    }

    private static void findList(int[] arr,int ptr, int target,List<Integer> temp, Set<List<Integer>> ans) {
        if(target == 0)
        {
            List<Integer> l = new ArrayList<>(temp);
            ans.add(l);
            return;
        }

        for(int i = ptr ; i < arr.length;  i++)
        {

                temp.add(arr[i]);
                findList(arr, i+1,target - arr[i], temp, ans);
                temp.removeLast();

                temp.add(-arr[i]);
                findList(arr, i+1,target + arr[i], temp, ans);
                temp.removeLast();

        }

    }
}
