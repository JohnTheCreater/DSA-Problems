package recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringSubset {

    public static void main(String []  args)
    {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        List<String> ans = new ArrayList<>();

        subset(str,"",ans);
        System.out.println(ans);
    }

    private static void subset(String str,String temp, List<String> ans) {
        if(str.isEmpty())
        {
            ans.add(temp);
            return;
        }
        char c = str.charAt(0);



        subset(str.substring(1),temp+c,ans);
        subset(str.substring(1),temp,ans);



    }
}
