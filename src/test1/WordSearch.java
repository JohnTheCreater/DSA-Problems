package test1;

import java.util.Scanner;

public class WordSearch {

    public static void main(String[] args)
    {
        char[][] grid = {{'A','B','C','E'},
                        {'S','F','C','S'},
                         {'A','D','E','E'}};
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        boolean [][] visited = new boolean[grid.length][grid[0].length];
        for(int i = 0 ; i < grid.length ; i++)
        {
            for(int j = 0 ; j < grid[0].length ; j++)
            {
                if(grid[i][j] == word.charAt(0) && canConstruct(grid,word,i,j,visited))
                {
                    System.out.println("true");
                    return;
                }
            }
        }
        System.out.println("false");
    }

    private static boolean canConstruct(char[][] grid, String word,int i,int j,boolean[][] visited) {

        if(word.length() == 0) return true;
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length ) return false;
        if(visited[i][j]) return false;

        if(word.charAt(0) == grid[i][j])
        {
            visited[i][j] = true;
            String rem = word.substring(1);
            boolean result =  canConstruct(grid,rem,i-1,j,visited) || canConstruct(grid,rem,i+1,j,visited) ||
                    canConstruct(grid,rem,i,j-1,visited) || canConstruct(grid,rem,i,j+1,visited);
            visited[i][j] = false;
            return result;
        }

        return false;

    }
}
