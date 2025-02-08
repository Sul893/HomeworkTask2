public class Task6 {
    public static void main(String[] args) {
        String word1 = "Математика";
        String word2 = "Материал";
        String word2Copy = "Математика";
        int countSimilar2 = 0;
        int countSimilar2Copy = 0;
        
        // Сравниваем символы в первой и второй строках и считаем совпадения
        for (int i = 0; i < word1.length() && i < word2.length(); i++) {
            if (String.valueOf(word2.charAt(i)).equals(String.valueOf(word1.charAt(i)))) {
                countSimilar2++;
            }
        }
        
        // Сравниваем символы в первой строке и копии второй строки
        for (int i = 0; i < word1.length() && i < word2Copy.length(); i++) {
            if (String.valueOf(word2Copy.charAt(i)).equals(String.valueOf(word1.charAt(i)))) {
                countSimilar2Copy++;
            }
        }
        
        System.out.println(countSimilar2);
        System.out.println(countSimilar2Copy);
    }
}
