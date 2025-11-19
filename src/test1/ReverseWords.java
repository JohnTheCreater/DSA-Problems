    package test1;

    import java.util.Scanner;

    public class ReverseWords {
        public static  void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            String ans = "";
            String temp = "";
            for(int i = 0 ; i < str.length() ; i++)
            {
                if(str.charAt(i) == ' ')
                {
                    ans = " "+temp + ans;
                    temp = "";
                }
                else
                {
                    temp += str.charAt(i);
                }
            }
            ans = temp + ans;
            System.out.println(ans);
        }
    }
