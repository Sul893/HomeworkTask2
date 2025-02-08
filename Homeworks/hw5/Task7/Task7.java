import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7 {
    public static void main(String[] args) {
        String text = "Сегодня отличный День для прогулки. Завтра будет еще лучше!";

        String reg = "\\b[A-ZА-ЯЁ][a-zа-яё]*\\b";
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
