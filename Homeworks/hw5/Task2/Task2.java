import java.io.*;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




        System.out.print("Введите слово или выражение, которое нужно заменить: ");
        String find = scanner.nextLine();

        System.out.print("Введите слово или выражение, на которое нужно заменить: ");
        String replace = scanner.nextLine();

        
        try{
        	// Считываю файл, использую BuffedReader т.к он может работать со строками
        	BufferedReader reader = new BufferedReader(new FileReader("RUS.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("Task2.txt"));
            String i;
            // Считываю файл построчно
            while ((i = reader.readLine()) != null) {
                String newLine = i.replace(find, replace); // Заменяю слово или выражение в строке
                // Записываю измененную строку в новый файл
                writer.write(newLine);
                writer.newLine(); // Перехжу на новую строку
            }

            System.out.println("Заменил: " + "Task2.txt" + "'.");
            writer.flush();
        } catch (IOException e) {
            System.out.println("Ошибка с файлом: " + e.getMessage());
        }
    }
}