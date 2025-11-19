package test1;


import java.util.Scanner;

public class NQueens {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        char[][] board = new char[n][n];
        generate(board,n,0);


    }

    private static void generate(char[][] board, int n,int pt) {
        if(n == 0)
        {
            for(int i = 0 ; i  < board.length;  i++)
            {
                for(int j = 0 ; j < board[0].length ; j++)
                {
                    System.out.print(board[i][j] +" ");
                }
                System.out.println();
            }
            System.out.println("---------------------------------------");
            return;
        }

        for(int i = pt ;i < board.length; i++)
        {
            for(int j= 0 ; j < board.length ; j++)
            {
                if(canPlace(board,i,j,board.length))
                {
                    board[i][j] = 'Q';
                    generate(board,n-1,i+1);
                    board[i][j] = '\0';
                }
            }
        }
    }

    private static boolean canPlace(char[][] board,int i, int j,int n) {

        if(board[i][j] == 'Q') return false;

        for (int l = 0; l < n; l++) {
            if (board[i][l] == 'Q' || board[l][j] == 'Q') return false;

            if(i-l >= 0 && j-l >= 0 && board[i-l][j-l] == 'Q') return false;
            if(i-l >= 0 && j+l < n && board[i-l][j+l] == 'Q') return false;
            if(i+l < n && j-l >= 0 && board[i+l][j-l] == 'Q' ) return false;
            if(i+l < n && j+l < n && board[i+l][j+l] == 'Q') return false;
        }

        for (int l = i - 1; l <= i + 1; l++)
        {
            if(l < 0 || l >=n) continue;
            for(int k = j-1 ; k <= j+1 ; k++)
            {
                if(k < 0 || k >= n) continue;
                if(board[l][k] == 'Q') return false;
            }
        }

        return true;


    }
}
