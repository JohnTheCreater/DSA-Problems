package string;

import java.util.Scanner;

public class FirstLastOccurence {

    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String ans = "";
        for(int i = 0 ; i < str.length(); i++)
        {
            char c = str.charAt(i);
            boolean flag = true;
            if(c >= 'a' && c <= 'z')
            {
                int back = i-1;
                while( back >= 0)
                {
                    if(str.charAt(back) == c)
                    {
                        flag = false;
                        break;

                    }
                    back--;
                }

            }
            else
            {

                int front = i + 1;
                while(front < str.length())
                {
                    if(str.charAt(front) == c)
                    {
                        flag = false;
                        break;

                    }
                    front++;
                }
            }
            if(flag) ans += c +"";
        }

        System.out.println(ans);
    }
}
