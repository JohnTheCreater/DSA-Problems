package test3;

import java.util.Scanner;

public class GasStation {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] gas = new int[n];
        int[] cost = new int[n];

        System.out.println("Gas : ");
        for(int i = 0 ; i < n ; i++)
        {
            gas[i] = scan.nextInt();
        }
        System.out.println("Cost : ");
        for(int i = 0 ; i < n ; i++)
        {
            cost[i] = scan.nextInt();
        }

        System.out.println(canCircleAround(gas,cost));

    }

    private static boolean canCircleAround(int[] gas,int[] cost)
    {
        int fuel = 0;

        for(int i = 0 ; i < gas.length ; i++)
        {
            fuel += gas[i] - cost[i];
        }

        return fuel >= 0;
    }

    private static boolean canCircle(int[] gas, int[] cost) {

        int start = -1;
        int n = gas.length;
        int tank = 0;
        for(int i = 0 ; i  < n ; i++)
        {
            if(cost[i] <= gas[i])
            {
                tank = 0;
                for(int j = i ; j < n ; j++)
                {
                    tank += gas[j];
                    tank -= cost[j];

                    if(tank < 0) break;

                }
                if(tank >= 0) {
                    start = i;
                    break;
                }
            }
        }
        for(int i = 0 ; i < start ; i++)
        {
            tank += gas[i];
            tank -= cost[i];
            if(tank < 0) return false;
        }
        return true;

    }


}
