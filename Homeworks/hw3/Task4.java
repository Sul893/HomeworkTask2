public class Task4 {
    public static void main(String[] args) {
        String sequence1 = "????№;%?";
        String sequence2 = "???????";
        int count1 = 0;
        int count2 = 0;
        
        // Проходим по длине первой последовательности и сравниваем
        // символы, чтобы подсчитать, сколько одинаковых символов в начале
        // строки. Используем break, чтобы остановить подсчет при
        // первом различии
        for (int i = 0; i < sequence1.length(); i++) {
            if (String.valueOf(sequence1.charAt(0)).equalsIgnoreCase(String.valueOf(sequence1.charAt(i)))) {
                count1++;
            } else {
                break;
            }
        }
        
        // Аналогично для второй последовательности
        for (int i = 0; i < sequence2.length(); i++) {
            if (String.valueOf(sequence2.charAt(0)).equalsIgnoreCase(String.valueOf(sequence2.charAt(i)))) {
                count2++;
            } else {
                break;
            }
        }
        
        System.out.println(count1);
        System.out.println(count2);
    }
}
