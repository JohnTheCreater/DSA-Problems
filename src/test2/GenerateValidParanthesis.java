package test2;

import java.util.ArrayList;
import java.util.List;

public class GenerateValidParanthesis {

    public static  void main(String[] args)
    {
        int n = 4;

        List<String> ans = new ArrayList<>();

        generate(n,0,0,ans,"");
        System.out.println(ans);
    }

    static void generate(int n , int open , int close, List<String> ans,String temp)
    {
        if(temp.length() == n * 2)
        {
            ans.add(temp);
            return;
        }



       if(open < n)
        generate(n,open+1,close,ans,temp + "(");
       if(close < open)
        generate(n,open,close+1,ans,temp + ")");

    }
}
