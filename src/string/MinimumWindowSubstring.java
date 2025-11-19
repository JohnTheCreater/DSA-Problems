package string;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MinimumWindowSubstring {

    public  static  void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();
        String t = scan.nextLine();

        int size = t.length();

        for(int i = size ; i <= s.length() ; i++)
        {
            for(int j = 0 ; j <= s.length() - i ; j++)
            {
                String temp = s.substring(j,j+i);
                if(isMatch(temp,t))
                {
                    System.out.println(temp);
                    return;
                }
            }
        }
    }

    private static boolean isMatch(String temp, String t) {
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < t.length() ; i++)
        {
            int index = findIndex(t.charAt(i) , temp,set);
            if(index == -1) return false;
            set.add(index);
        }
        return true;
    }

    private static int findIndex(char c, String temp, Set<Integer> set) {

        for(int i  = 0 ; i < temp.length(); i++)
        {
            if(!set.contains(i) && temp.charAt(i) == c)
                return i;
        }
        return -1;
    }
}
