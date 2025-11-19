package test;
import java.util.*;

public class Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] matrix = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int X = sc.nextInt();
        int Y = sc.nextInt();

        long sum = 0;
        int count = 0;

        // Check all 8 possible neighbors manually
        if (X - 1 >= 0) {                 // top
            sum += matrix[X - 1][Y];
            count++;
        }
        if (X + 1 < N) {                  // bottom
            sum += matrix[X + 1][Y];
            count++;
        }
        if (Y - 1 >= 0) {                 // left
            sum += matrix[X][Y - 1];
            count++;
        }
        if (Y + 1 < M) {                  // right
            sum += matrix[X][Y + 1];
            count++;
        }
        if (X - 1 >= 0 && Y - 1 >= 0) {   // top-left
            sum += matrix[X - 1][Y - 1];
            count++;
        }
        if (X - 1 >= 0 && Y + 1 < M) {    // top-right
            sum += matrix[X - 1][Y + 1];
            count++;
        }
        if (X + 1 < N && Y - 1 >= 0) {    // bottom-left
            sum += matrix[X + 1][Y - 1];
            count++;
        }
        if (X + 1 < N && Y + 1 < M) {     // bottom-right
            sum += matrix[X + 1][Y + 1];
            count++;
        }

        double avg = (count == 0) ? 0 : (sum * 1.0 / count);
        System.out.println(avg);
    }
}
