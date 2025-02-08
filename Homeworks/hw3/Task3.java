public class Task3 {
    public static void main(String[] args) {
        String sentence = "  Просто хороший день";
        // Удаляем лишние пробелы в начале и в конце строки
        sentence = sentence.trim();
        // Находим индекс первого пробела, чтобы определить, 
        // где заканчивается первое слово
        int firstSpaceIndex = sentence.indexOf(" ");
        int countO = 0;
        // С помощью цикла сравниваем буквы с "О" и подсчитываем 
        // их количество, учитывая регистр
        for (int i = 0; i < firstSpaceIndex; i++) {
            if ("о".equalsIgnoreCase(String.valueOf(sentence.charAt(i)))) {
                countO++;
            }
        }
        System.out.println(countO);
    }
}
