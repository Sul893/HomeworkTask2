import java.util.Scanner;

public class Task5 {
    public static void main(String args[]) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Введите n <= 999999:");
        int number = inputScanner.nextInt();
        int length = 6;
        int[] digitsArray = new int[length];
        
        int actualLength = 0;
        for (int index = 0; index < length; index++) {
            int digit = number % 10;
            number = number / 10;
            digitsArray[index] = digit;
            actualLength++;
        }
        
        for (int index = 0; index < actualLength; index++) {
            System.out.println(digitsArray[index]);
        }
    }
}
