package date_question;

import java.util.Scanner;

public class AddDaysToDate {
    public static  void  main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();
        int month = scan.nextInt();
        int year = scan.nextInt();
        int daysToAdd = scan.nextInt();

        int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};

        int currentMonthDays = months[month-1];
        int extraDay = month == 2 && isLeapYear(year) ? 1:0;

        if(daysToAdd <= currentMonthDays+extraDay - day)
        {
            day += daysToAdd;
        }
        else
        {
            extraDay = month == 2 && isLeapYear(year) ? 1:0;
            daysToAdd -= currentMonthDays - day + extraDay ;
            month++;
            while (daysToAdd > 0)
            {
                extraDay = month == 2 && isLeapYear(year) ? 1:0;
                if(daysToAdd <= months[month-1]+extraDay)
                {
                    day = daysToAdd;
                    break;

                }

                daysToAdd  -= months[month-1]+extraDay;
                month++;
                if(month == 13)
                {
                    year++;
                    month = 1;
                }

            }
        }
        System.out.println(day +" " +month +" " +year);

    }
    public static boolean isLeapYear(int year)
    {
        return ( year%4 == 0 && year%100 != 0 ) || ( year%400 == 0);
    }
}
