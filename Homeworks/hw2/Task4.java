import java.util.Scanner;
import java.util.Random;

public class Task4 {
    public static void main(String args[]) {
        Scanner inputScanner = new Scanner(System.in);
        Random randomGenerator = new Random();
        System.out.println("Введите m и n:");
        int rows = inputScanner.nextInt();
        int columns = inputScanner.nextInt();
        int[][] matrix = new int[rows][columns];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = randomGenerator.nextInt(15);
            }
        }
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        int totalSum = 0;
        for (int i = 0; i < rows; i++) {
            int maxInRow = 0;
            for (int j = 1; j < columns; j++) {
                if (matrix[i][j] > maxInRow) {
                    maxInRow = matrix[i][j];
                }
            }
            totalSum += maxInRow;
        }
        System.out.println(totalSum);
    }
}
