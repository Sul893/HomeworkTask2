import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Task5 {
    public static void main(String[] args) {

        String reg = "\\+7-\\d{3}-\\d{3}-\\d{2}-\\d{2}";
        Pattern pattern = Pattern.compile(reg);

        try {
            //считывание через buffedreader
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            String line;
            //считываю файл построчно
            while ((line = reader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);

                //поиск совпадений
                while (matcher.find()) {
                    String phoneNumber = matcher.group(); // получаем номер телефона
                    writer.write(phoneNumber); // сохрание номера в выхдном файле
                    writer.newLine();
                    System.out.println("номер: " + phoneNumber);
                }
                
            }
            writer.flush();
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
