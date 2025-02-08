import java.util.regex.Pattern;

public class Task8 {
    public static void main(String[] args) {
        String[] strs = {"12345", "123a45", "67890", "000", "12.34", " "};
        String reg = "^\\d+$";

        for (String str : strs) {
            if (Pattern.matches(reg, str)) {
                System.out.println(str + " цифры");
            } else {
                System.out.println(str + " не только цифры");
            }
        }
    }
}
