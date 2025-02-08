import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа через пробел:");
        try {
            // считываб строку
            String input = scanner.nextLine();

            // делю по пробелу числа
            String[] parts = input.split(" ");

            // Проверяю что введено толкьо два числа
            if (parts.length != 2) {
                System.out.println("Ошибка: нужно ввести ровно два числа.");
                return;
            }
            // строки в числа
            int num1 = Integer.parseInt(parts[0]);
            int num2 = Integer.parseInt(parts[1]);
            double result = (double)num1 / num2;

            System.out.println("Результат деления: " + result);

        } catch (NumberFormatException e) {
            // если введены не числа
            System.out.println("Ошибка: введены некорректные числа.");
        } catch (ArithmeticException e) {
            //если деление на ноль
            System.out.println("Ошибка: деление на ноль невозможно.");
        }
    }
}