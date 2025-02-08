import java.io.*;

//создал свое исключение
class EmptyFileException extends Exception {
    public EmptyFileException(String message) {
        super(message); // Передаю сообщение в конструктор родительского класса Exception
    }
}

public class Task4 {
    public static void main(String[] args) {
        
        // обработка исклбчений
        try {
            processFile("input.txt"); //обработка файла
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка: Файл не найден.");
        } catch (EmptyFileException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Невозможно конвертировать строку в число.");
        } catch (IOException e) {
            System.out.println("Ошибка: Проблема с чтением файла.");
        }
    }

    // Метод для обработки файла
    public static void processFile(String fileName) throws IOException, EmptyFileException {
        // чтение файла
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line; // хранения текущей строки
        int lineNumber = 0;
        boolean isEmpty = true;

        // считываю файл построчно
        while ((line = reader.readLine()) != null) {
            lineNumber++;
            isEmpty = false; //файл не пуст
            // преобразование строки в число
            try {
                int number = Integer.parseInt(line);
                System.out.println("Строка " + lineNumber + ": " + number);
            } catch (NumberFormatException e) { // если возника ошибка в преобразовании
    
                System.out.println(lineNumber + ": " + line + " не является числом.");
            }
        }


        // ели файл пусто
        if (isEmpty) {
            throw new EmptyFileException("Пусто 😲");
        }
    }
}
