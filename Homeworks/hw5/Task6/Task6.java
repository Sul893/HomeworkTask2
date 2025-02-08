import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {
    public static void main(String[] args) {
        String text = " 01.01.2025 02.02.2053 24.02.2022 " + "32.01.2023, 01.13.2023, 01.01.23.";

        String reg = "\\b(0[1-9]|[12][0-9]|3[01])\\.(0[1-9]|1[0-2])\\.(\\d{4})\\b";
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("дата: " + matcher.group());
        }
    }
}
