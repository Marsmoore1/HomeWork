import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex8_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите дату в формате ГГГГ/ММ/ДД");
        String data=sc.nextLine();
        Pattern pattern=Pattern.compile("(((1[0-9])\\d{2})|(20(0[1-9]|1[0-2])))/(0[1-9]|1[0-2])/(0[1-9]|1[0-9]|2[0-9]|30)");
        Matcher matcher= pattern.matcher(data);
        if (matcher.find()) {
            System.out.println("Дата "+data+ " существует");
        }
        else {
            System.out.println("Даты "+data+ " не существует");
        }
    }
}