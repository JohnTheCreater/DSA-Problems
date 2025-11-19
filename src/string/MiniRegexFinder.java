package string;

import java.util.Scanner;

public class MiniRegexFinder {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String pattern = scan.nextLine();

        for(int i = 0 ; i < str.length() ; i++)
        {
            if(pattern.charAt(0) == str.charAt(i))
            {
                int end = findEnd(str,pattern,i,0);
                System.out.println(i+" "+end);
                if(end != -1)
                {
                    System.out.println(str.substring(i,end));
                    return;
                }
            }
        }
    }

    private static int findEnd(String str, String pattern,int s,int p) {

        if(p == pattern.length()) return s;

        if(s == str.length())
        {
           if(p+1 == pattern.length() && pattern.charAt(p) == '*') return s;
           return -1;
        }
        int max = -1;
        boolean isMatching = str.charAt(s) == pattern.charAt(p);

        if(p+1 < pattern.length() && pattern.charAt(p+1) == '*')
        {
            if(isMatching)
            {
                max = Math.max(findEnd(str,pattern,s+1,p+2),max);
                max = Math.max(findEnd(str,pattern,s+1,p),max);
            }
            else
            {
            max = Math.max(findEnd(str,pattern,s,p+2),max);
            }
        }
        else if(p+1 < pattern.length() && pattern.charAt(p+1) == '+')
        {
            if(isMatching)
            {
                max = Math.max(findEnd(str,pattern,s+1,p+2),max);
                max = Math.max(findEnd(str,pattern,s+1,p),max);
            }
            else
            {
                return -1;
            }
        }
        else if(isMatching)
        {
            max = Math.max(findEnd(str,pattern,s+1,p+1),max);
        }
        else
        {
            return -1;
        }

        return max;


    }
}
