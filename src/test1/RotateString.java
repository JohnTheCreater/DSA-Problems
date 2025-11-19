package test1;

import java.util.Scanner;

public class RotateString {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();

        a += a;
        System.out.println(a.contains(b));
    }
}
