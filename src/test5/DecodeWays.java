package test5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DecodeWays {


        public static void main(String[] args)
        {
            String str = new Scanner(System.in).nextLine();
            System.out.println(numDecodings(str));
        }

        public static int numDecodings(String s) {

            return helper(s,0,new HashMap());

        }

        static int  helper(String str, int ptr, Map<Integer,Integer> memo)
        {
            if(ptr >= str.length()) return 1;
            if(memo.containsKey(ptr)) return memo.get(ptr);
            if( str.charAt(ptr) == '0') return 0;

            int total = 0;
            total += helper(str,ptr+1,memo);
            if(ptr + 1 < str.length())
            {
                int num2 = Integer.parseInt(str.charAt(ptr) +""+ str.charAt(ptr + 1) );
                if(num2 <= 26)
                    total += helper(str,ptr+2,memo);
            }
            memo.put(ptr,total);
            return total;

        }


}
