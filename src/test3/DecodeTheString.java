package test3;

import java.util.Scanner;

public class DecodeTheString {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        System.out.println(decode(str));
    }

    private static String decode(String str) {

        if(isPureString(str)) return str;
        int ptr = 0;
        StringBuilder ans = new StringBuilder();
        while (ptr < str.length())
        {
            StringBuilder num = new StringBuilder();
            while(ptr < str.length() && Character.isLetter(str.charAt(ptr)))
            {
                ans.append(str.charAt(ptr));
                ptr++;
            }

            while(ptr < str.length() && str.charAt(ptr) >= '0' && str.charAt(ptr) <= '9')
            {
                num.append(str.charAt(ptr));
                ptr++;
            }
            System.out.println(num);
            ptr++;
            int openCount = 1;
            StringBuilder encodedStr = new StringBuilder();
            while(ptr < str.length() && openCount != 0)
            {
                if(str.charAt(ptr) == '[')
                    openCount++;
                else if(str.charAt(ptr) == ']')
                    openCount--;
                if(openCount != 0)
                    encodedStr.append(str.charAt(ptr));
                ptr++;
            }
            String expandedString = decode(encodedStr.toString());
            if(num.isEmpty())
                ans.append(expandedString);
            else
                for(int i = 0 ; i < Integer.parseInt(num.toString()) ; i++)
                    ans.append(expandedString);

        }
        return ans.toString();
    }

    private static boolean isPureString(String str) {

        for(int i = 0 ; i < str.length() ; i++)
        {
            if(str.charAt(i) == '[' || str.charAt(i) == ']') return false;
        }
        return true;
    }
}
