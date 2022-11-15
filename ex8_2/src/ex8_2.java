import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex8_2 {
    public static void main(String[] args) {
        System.out.println("Введите текст, содержащий ссылку:");
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        Pattern pat= Pattern.compile("((https|http)://)?\\w{2,}.(com)");
        Matcher matcher= pat.matcher(text);
        if (matcher.find()){
            System.out.println("Найденные ссылки:");
            System.out.println(matcher.group());
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }
        else {
            System.out.println("Ссылок не найдено");
        }
    }
}