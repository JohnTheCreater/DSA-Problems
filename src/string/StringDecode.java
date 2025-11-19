package string;


public class StringDecode {

    public static void main(String[] args)
    {
        String s = "abcdefgret",temp ="",ans = "";
        int k = 3;
        boolean flag = true;
        for(int i = 0 ; i < s.length() ; i++)
        {
            temp += s.charAt(i);
            if((i+1) % k == 0)
            {
                if(flag)
                {
                    ans += reverse(temp);
                }
                else
                {
                    ans += temp;
                }
                flag = !flag;
                temp = "";
            }
        }
        if(flag)
            ans += reverse(temp);
        else
            ans += temp;
        System.out.println(ans);
    }

    private static String reverse(String temp) {
        String rev = "";

        for(int i = temp.length()-1; i >= 0 ; i--)
        {
            rev += temp.charAt(i);
        }
        return rev;
    }
}
