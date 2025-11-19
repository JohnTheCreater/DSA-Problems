package test1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PermutationVowelPattern {

    public static  void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        char[] vowels = {'a','e','i','o','u'};
        boolean[] visited = new boolean[5];

        List<String> ans = new ArrayList<>();

        generateStr(str,0,"",vowels,visited,ans);

        System.out.println(ans);


    }

    private static void generateStr(String str, int p,String temp, char[] vowels, boolean[] visited, List<String> ans) {

        if(temp.length() == str.length())
        {
            ans.add(temp);
            return;
        }
        if(str.charAt(p) == '*')
        {
            for(int i = 0 ; i < vowels.length ; i++)
            {
                if(!visited[i])
                {
                    visited[i] = true;
                    generateStr(str,p+1,temp+vowels[i],vowels,visited,ans);
                    visited[i] = false;
                }
            }
        }
        else
        {
            generateStr(str,p+1,temp+str.charAt(p),vowels,visited,ans);
        }
    }
}
