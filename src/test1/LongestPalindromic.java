package test1;

import javax.swing.text.html.StyleSheet;
import java.util.Scanner;

public class LongestPalindromic {

    public static  void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        System.out.println(longestPalindrom(str));
    }

    private static String longestPalindrom(String str) {

        for(int i = str.length() ; i > 1 ; i-- )
        {
            StringBuffer s = new StringBuffer(str.substring(0,i));
            for(int j = i; j <= str.length(); j++)
            {
                if(isPalindrome(s.toString())) return s.toString();
                if(j < str.length()) {
                    s.deleteCharAt(0);
                    s.append(str.charAt(j));
                }
            }
        }
        return  str.charAt(0)+"";
    }
    public static  boolean isPalindrome(String s)
    {
        int i = 0 ,j = s.length()-1;

        while(i < j)
        {
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
