package test1;

import java.util.Scanner;

public class LongPressedName {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String longVersion = scan.nextLine();

        System.out.println(isLongVersion(name,longVersion));
    }

    private static boolean isLongVersion(String name, String longVersion) {

        int p1 = 0 , p2 = 0;
        int n1 = name.length() , n2 = longVersion.length();
        if(n2 < n1) return false;
        while(p1 < n1 && p2 < n2)
        {
            while(p1 +1 < n1 && name.charAt(p1) == name.charAt(p1+1)) p1++;
            while(p2+1 < n2 && longVersion.charAt(p2) == longVersion.charAt(p2+1)) p2++;

            if(name.charAt(p1) != longVersion.charAt(p2)) return  false;
            p1++;
            p2++;
        }
        while (p2 < n2)
        {
            if(longVersion.charAt(p2) != name.charAt(n1-1)) return false;
            p2++;
        }
        return true;
    }
}
