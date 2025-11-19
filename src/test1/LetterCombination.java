package test1;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LetterCombination {

    public static void main(String[] args)
    {
        String[] letters = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};


        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        List<String> ans = new ArrayList<>();

        generate(input,"",letters,ans);
        System.out.println(ans);
    }

    private static void generate(String input,String temp, String[] letters, List<String> ans) {

        if(input.length() == 0)
        {
            ans.add(temp);
            return;
        }

        int num = input.charAt(0) -'0';
        String str = letters[num];
        String rem = input.substring(1);
        for(int i = 0 ; i < str.length() ; i++)
        {
            generate(rem,temp+str.charAt(i),letters,ans);
        }

    }
}
