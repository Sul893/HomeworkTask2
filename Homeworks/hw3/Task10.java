public class Task10 {
    public static void main(String[] args) {
        String inputText1 = "aaaa";
        String inputText2 = "скоро коллок..";
        inputText2 = inputText2.trim();
        int count1 = 0;
        int count2 = 0;
        
        // Разбиваем первую строку на слова и считаем их количество
        String[] wordsArray1 = inputText1.split("  ");
        for (String word : wordsArray1) {
            String[] subWordsArray1 = word.split(" ");
            for (String subWord : subWordsArray1) {
                count1++;
            }
        }
        
        // Разбиваем вторую строку на слова и считаем их количество
        String[] wordsArray2 = inputText2.split("  ");
        for (String word : wordsArray2) {
            String[] subWordsArray2 = word.split(" ");
            for (String subWord : subWordsArray2) {
                count2++;
            }
        }
        
        System.out.println(count1);
        System.out.println(count2);
    }
}
