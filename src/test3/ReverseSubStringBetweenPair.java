package test3;

import java.util.Scanner;

public class ReverseSubStringBetweenPair {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        System.out.println(reverse(str));
    }

    private static String reverse(String str) {
        if(isPureString(str)) return str;

        int ptr = 0 ;
        StringBuilder ans = new StringBuilder();
        while(ptr < str.length())
        {
            while(ptr < str.length() && str.charAt(ptr) != '(')
            {
                ans.append(str.charAt(ptr));
                ptr++;
            }
            StringBuilder temp = new StringBuilder();
            ptr++;
            int openCount = 1;
            while(ptr < str.length() && openCount != 0)
            {
                if(str.charAt(ptr) == '(')
                    openCount++;
                else if(str.charAt(ptr) == ')')
                    openCount--;
                if(openCount != 0)
                    temp.append(str.charAt(ptr));
                ptr++;
            }
            String solvedStr = reverse(temp.toString());
            ans.append(new StringBuilder(solvedStr).reverse());

        }
        return ans.toString();
    }

    private static boolean isPureString(String str) {

        for(int i= 0 ; i < str.length(); i++)
        {
            if(str.charAt(i) == '(')  return false;
        }
        return true;

    }
}
