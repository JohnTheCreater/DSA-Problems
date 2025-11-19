import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int startDay = scan.nextInt();
        int startMonth = scan.nextInt();
        int startYear = scan.nextInt();

        int endDay = scan.nextInt();
        int endMonth = scan.nextInt();
        int endYear = scan.nextInt();

        int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};

        int days = 0;

        if(startYear == endYear && startMonth == endMonth)
        {
            days = endDay - startDay;
        }
        else
        {
            days +=  months[startMonth-1] - startDay;
            startMonth++;
            while (startYear <= endYear) {
                if (startMonth == endMonth && startYear == endYear) {
                    days += endDay;
                    break;
                }
                if(startMonth == 2 && isLeapYear(startYear))
                    days++;
                days += months[startMonth - 1];
                startMonth++;
                if (startMonth == 13) {
                    startYear++;
                    startMonth = 1;
                }

            }
        }
        System.out.println(days);

    }
    public static boolean isLeapYear(int year)
    {
        return ( year%4 == 0 && year%100 != 0 ) || ( year%400 == 0);
    }
}