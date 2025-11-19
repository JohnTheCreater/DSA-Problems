package test5;

import java.util.Scanner;

public class CPUScheduling {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cooldown = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] tasks = new int[n][2];
        for(int i = 0 ; i < n ; i++)
        {
            tasks[i][0] = scanner.nextInt();
            tasks[i][1] = scanner.nextInt();
        }
        int[] cores = new int[n];
        int[] coreTasksCount = new int[n];
        int count = 0;
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                if(coreTasksCount[j] < m && cores[j] + cooldown <= tasks[i][0])
                {
                    if(coreTasksCount[j] == 0) count++;
                    cores[j] = tasks[i][1];
                    coreTasksCount[j]++;
                    break;
                }
            }
        }
        System.out.println(count);

    }
}

