import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Проверка слова на палиндром, введите слово:");
        String inputWord = inputScanner.nextLine();
        int matchCount = 0;
        
        // Сравниваем символы с начала и конца слова
        for (int i = 0; i < inputWord.length() - 1; i++) {
            for (int j = inputWord.length() - 1; j > 0; j--) {
                if (String.valueOf(inputWord.charAt(j)).equalsIgnoreCase(String.valueOf(inputWord.charAt(i)))) {
                    matchCount++;
                }
            }
        }
        
        // Проверяем, является ли слово палиндромом
        if (matchCount == inputWord.length() - 1) {
            System.out.println("Слово является палиндромом");
        } else {
            System.out.println("Слово не является палиндромом");
        }
    }
}
