package test5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AlienDirectory {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String[] arr = new String[n];
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = scanner.next();
        }
        scanner.nextLine();
        String message = scanner.nextLine();


        Map<Character,Integer> order = new HashMap<>();
        int ptr = 0;
        for(int i = 0 ; i < n-1 ; i++)
        {
            int min = Math.min(arr[i].length() , arr[i+1].length());
            int j = 0 ;
            while( j < min)
            {
                char c1 = arr[i].charAt(j);
                char c2 = arr[i+1].charAt(j);
                if( c1 != c2 )
                {
                    if(!order.containsKey(c1))
                    {
                        order.put(c1,ptr++);
                    }
                    if(!order.containsKey(c2)) {
                        order.put(c2,ptr++);
                    }

                    break;
                }
                j++;
            }
        }

        String ans = "";
        for(int i = 0 ; i < message.length() ; i++)
        {
            char c = message.charAt(i);
            ans += (char) (order.get(c) + 'A');
        }
        System.out.println(ans);
    }
}
