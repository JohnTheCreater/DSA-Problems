package string;

import java.util.Scanner;

public class CompareVersion {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();

        System.out.println(compareVersions(s1, s2));


    }

    private static int compareVersions(String s1, String s2) {
        int p1 = 0, p2 = 0;
        while (p1 < s1.length() && p2 < s2.length()) {
            StringBuilder num1 = new StringBuilder();
            boolean isLeading = true;
            while (p1 < s1.length() && s1.charAt(p1) != '.') {
                if (isLeading && s1.charAt(p1) != '0') {
                    isLeading = false;
                }
                if (!isLeading) {
                    num1.append(s1.charAt(p1));
                }
                p1++;
            }
            StringBuilder num2 = new StringBuilder();
            isLeading = true;
            while (p2 < s2.length() && s2.charAt(p2) != '.') {
                if (isLeading && s2.charAt(p2) != '0') {
                    isLeading = false;
                }

                if (!isLeading) {
                    num2.append(s2.charAt(p2));
                }
                p2++;
            }
            int result = compare(num1.toString(), num2.toString());
            if (result != 0) {
                return result;
            }
            p1++;
            p2++;
        }

        while (p1 < s1.length()) {
            if (s1.charAt(p1) != '.' && s1.charAt(p1) != '0') return 1;
            p1++;
        }
        while (p2 < s2.length()) {
            if (s2.charAt(p2) != '.' && s2.charAt(p2) != '0') return -1;
            p2++;
        }

        return 0;

    }

    private static int compare(String num1, String num2) {
        int n1 = num1.length(), n2 = num2.length();
        if (n1 < n2) return -1;
        else if (n1 > n2) return 1;
        else {
            int i = 0;
            while (i < n1) {
                if (num1.charAt(i) > num2.charAt(i)) return 1;
                else if (num1.charAt(i) < num2.charAt(i)) return -1;
                i++;
            }
        }
        return 0;
    }
}


