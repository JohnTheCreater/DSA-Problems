package test2;

import java.util.ArrayList;
import java.util.List;

public class BinaryStringCombination {

    public static void main(String[] args)
    {
        String s = "111??1?0";

        List<String > ans = new ArrayList<>();

        generate(s,0,"",ans);

        System.out.println(ans);
    }

    private static void generate(String s, int p, String temp,List<String> ans) {
        if( p == s.length())
        {
            ans.add(temp);
            return;
        }

        if(s.charAt(p) == '?')
        {
            generate(s,p+1,temp+"0",ans);
            generate(s,p+1,temp+"1",ans);
        }
        else
        {
            generate(s,p+1,temp+s.charAt(p)+"",ans);
        }


    }
}
