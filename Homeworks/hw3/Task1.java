import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        Random randGen = new Random();
        System.out.println("Введите размер матрицы n:");
        int size = inputScanner.nextInt();
        int[][] matrix = new int[size][size];
        
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                matrix[row][col] = randGen.nextInt(5);
            }
        }
        
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
        
        for (int row = 0; row < size; row++) {
            // Инициализируем переменные для проверки условий
            int countZeros = 0;
            int countSame = 0;
            int countOdd = 0;
            int countIncreasing = 0;
            int countDecreasing = 0;
            
            for (int col = 0; col < size; col++) {
                
                // Реализуем логику для подсчета выполнения условий
                
                if (matrix[row][col] == 0) {
                    countZeros++;
                }
                
                if ((0 <= col) && (col < size - 1)) {
                    if (matrix[row][col] == matrix[row][col + 1]) {
                        countSame++;
                    }
                }
                
                if (matrix[row][col] % 2 != 0) {
                    countOdd++;
                }
                
                if ((0 <= col) && (col < size - 1)) {
                    if (matrix[row][col] < matrix[row][col + 1]) {
                        countIncreasing++;
                    }
                }
                
                if ((0 <= col) && (col < size - 1)) {
                    if (matrix[row][col] > matrix[row][col + 1]) {
                        countDecreasing++;
                    }
                }
            }
            
            // Проверяем, если количество выполненных условий соответствует необходимому
            // и выводим номер строки, если условия выполнены
            
            if (countZeros == size) {
                System.out.println("Все элементы равны нулю, номер строки: " + row);
            }
            
            if (countSame == size) {
                System.out.println("Все элементы одинаковые, номер строки: " + row);
            }
            
            if (countOdd == size) {
                System.out.println("Все элементы нечётные, номер строки: " + row);
            }
            
            if (countIncreasing == (size - 1) || countDecreasing == (size - 1)) {
                System.out.println("Монотонная последовательность, номер строки: " + row);
            }
        }
    }
}
