package test4;

import java.util.Scanner;

public class SaddlePoint {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[][] mat = new int[m][n];

        for(int i = 0 ; i < m ; i++)
        {
            for(int j = 0 ; j < n ; j++)
                mat[i][j] = scanner.nextInt();
        }

        boolean isSaddleFound = false;
        for(int i = 0 ; i < m ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                if(isSaddlePoint(i,j,mat))
                {
                    System.out.println("saddle point found : "+mat[i][j] +" at pos "+i +" "+j);
                    isSaddleFound = true;
                }
            }
        }
        if(!isSaddleFound)
            System.out.println("No saddle found!");



    }

    private static boolean isSaddlePoint(int i, int j, int[][] mat) {

        for(int l = 0 ; l < mat.length;l++)
        {
            if( l != i && mat[l][j] > mat[i][j]) return false;
        }

        for(int b = 0 ; b < mat[0].length ; b++)
        {
            if(b != j && mat[i][b] < mat[i][j]) return false;
        }
        return true;
    }
}
