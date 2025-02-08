public class Task7 {
    public static void main(String[] args) {
        String inputText = "   Стул 9 стол 6 скатерть 9 чашка 2 ";
        inputText = inputText.trim();
        
        // Ищем индексы цифр от 9 до 1 в строке
        for (int i = 9; i > 0; i--) {
            if (inputText.indexOf(String.valueOf(i)) != -1) {
                System.out.println(inputText.indexOf(String.valueOf(i)));
                break; // Прерываем цикл после нахождения первой цифры
            }
        }
    }
}
