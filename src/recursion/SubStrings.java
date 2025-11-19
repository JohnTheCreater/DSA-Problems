package recursion;

import java.util.Scanner;

public class SubStrings {

    public static  void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        printSubStrings(str,"",0);
    }

    private static void printSubStrings(String str,String t, int i) {
        if( i == str.length())
        {
            System.out.print(t + " ");
            return;
        }
        System.out.print(t+" ");
        printSubStrings(str, str.charAt(i)+"",i+1);
        if(t!="" +
                "")
        printSubStrings(str,t+str.charAt(i),i+1);

    }
}
