package test3;

import java.util.Scanner;

public class ConvertBase {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        int base = scan.nextInt();

        StringBuilder ans = new StringBuilder();

        while(number > 0)
        {
            int rem = number % base;
            String num;
            if(rem >= 10 && rem < 36)
            {
                num = (char)('A' + (rem - 10)) + "";
            }
            else
            {
                num = rem +"";
            }

            ans.insert(0, num);
            number /= base;
        }

        System.out.println(ans);
    }
}
