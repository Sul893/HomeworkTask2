import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        Random randGen = new Random();
        System.out.println("Введите размер матрицы n:");
        int size = inputScanner.nextInt();
        int[][] matrix = new int[size][size];
        
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                matrix[row][col] = randGen.nextInt(-3, 3);
            }
        }
        
        // Выводим матрицу для проверки корректности работы
        
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
        
        // Вычисляем сумму элементов строки, начинающейся с отрицательного элемента и расположенной выше
        int sumAbove = 0;
        for (int row = 0; row < size; row++) {
            if (matrix[row][0] < 0) {
                for (int col = 0; col < size; col++) {
                    sumAbove += matrix[row][col];
                }
                break; // Прерываем цикл после нахождения первой строки
            }
        }
        
        // Вычисляем сумму элементов строки, начинающейся с отрицательного элемента и расположенной ниже
        int sumBelow = 0;
        for (int row = size - 1; row > 0; row--) {
            if (matrix[row][0] < 0) {
                for (int col = 0; col < size; col++) {
                    sumBelow += matrix[row][col];
                }
                break; // Прерываем цикл после нахождения первой строки
            }
        }
        
        // Вычисляем сумму элементов на главной диагонали, начинающихся с отрицательного элемента
        int sumDiagonal = 0;
        for (int row = 0; row < size; row++) {
            if (matrix[row][0] < 0) {
                sumDiagonal += matrix[row][row];
            }
        }
        
        System.out.println("Сумма элементов строки, начинающейся с отрицательного элемента и расположенной выше: " + sumAbove);
        System.out.println("Сумма элементов строки, начинающейся с отрицательного элемента и расположенной ниже: " + sumBelow);
        System.out.println("Сумма элементов на главной диагонали, начинающихся с отрицательного элемента: " + sumDiagonal);
    }
}
