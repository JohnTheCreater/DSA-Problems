package test4;

import java.util.Scanner;

public class MiniRegexFinder {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        String pattern = scanner.nextLine();
        for(int i = 0 ; i < str.length(); i++)
        {
            int end = findMatchEnd(str,pattern,i,0);
            if(end != -1)
            {
                System.out.println(str.substring(i,end));
                return;
            }
        }

    }

    private static int findMatchEnd(String str, String pattern, int i, int ptr) {

        if(ptr >= pattern.length())
        {
            return i;
        }
        if(i >= str.length())
        {
            return -1;
        }
        boolean isMatch = str.charAt(i) == pattern.charAt(ptr);
        if(ptr + 1 < pattern.length() && pattern.charAt(ptr+1) == '*')
        {
            if(!isMatch) return findMatchEnd(str,pattern,i,ptr+2);
            return Math.max(findMatchEnd(str,pattern,i+1,ptr),findMatchEnd(str,pattern,i+1,ptr+2));
        }

        if(ptr + 1 < pattern.length()  && pattern.charAt(ptr+1) == '+')
        {
            if(!isMatch) return -1;
            return Math.max(findMatchEnd(str,pattern,i+1,ptr),findMatchEnd(str,pattern,i+1,ptr+2));
        }

        if(isMatch)
        {
            return findMatchEnd(str,pattern,i+1,ptr+1);
        }

        return -1;


    }
}
