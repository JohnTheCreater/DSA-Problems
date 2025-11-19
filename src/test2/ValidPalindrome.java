package test2;

public class ValidPalindrome {

    public static void main(String[] args)
    {
        String s = "hayjo ,hn,g n hoj; yah";
        s = s.trim();

        int p1 = 0 , p2 = s.length()-1;

        while (p1 < p2)
        {

            while(p1 < p2 && !isChar(s.charAt(p1))) p1++;

            while (p2 > p1 && !isChar(s.charAt(p2))) p2--;

            char first = convert(s.charAt(p1));
            char last = convert(s.charAt(p2));
            System.out.println(first +" "+ last);
            if(first != last)
            {
                System.out.println("false");
                return;
            }

            p1++;
            p2--;

        }
        System.out.println("true");
    }

    public static  boolean isChar(char c)
    {
        return (c >= 'a' && c <= 'z') || ( c >= 'A' && c <= 'Z');
    }

    public static char convert(char c)
    {
        if( c >= 'A' && c <= 'Z')
            c = (char) (c + 32);

        return c;
    }
}
