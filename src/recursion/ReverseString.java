package recursion;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String reversedStr = reverse(s,"",0);
        System.out.println(reversedStr);
    }

    private static String reverse(String s,String t, int i) {
        if( i == s.length() ) return t;

        if(s.charAt(i) == ' ')
        {
            return  reverse(s,"",i+1) + " " + t;
        }

        t += s.charAt(i);
        return reverse(s,t,i+1);
    }

}
