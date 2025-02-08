public class Task5 {
    public static void main(String[] args) {
        String word1 = "Процессор";
        String word2 = "Информация";
        // Создаём строку без повторяющихся букв
        String uniqueChars = "";
        
        // С помощью цикла оставляем только уникальные буквы из первой строки
        for (int i = 0; i < word1.length(); i++) {
            if (uniqueChars.indexOf(word1.charAt(i)) == -1) {
                uniqueChars += word1.charAt(i);
            }
        }
        
        // Проверяем, есть ли повторяющиеся буквы во второй строке
        for (int i = 0; i < uniqueChars.length(); i++) {
            if (word2.indexOf(uniqueChars.charAt(i)) != -1) {
                System.out.print("да ");
            } else {
                System.out.print("нет ");
            }
        }
    }
}
