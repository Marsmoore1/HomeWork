import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex8_4 {
    public static void main(String[] args) {
        String str ="ab abab abab abababab abea";
        Pattern pattern=Pattern.compile("(a)(b)");
        Matcher matcher= pattern.matcher(str);
        int count=0;
        while (matcher.find()){
            count++;
        }
        System.out.println("Строка ab повторяется "+count+ " раз");
    }
}