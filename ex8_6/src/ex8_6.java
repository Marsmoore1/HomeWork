import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex8_6 {
    public static void main(String[] args) {
        System.out.println("Введите возраст");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        sc.nextLine();
        System.out.println("Введите ФИО через пробел");
        String name=sc.nextLine();
        Pattern pattern=Pattern.compile("^[А-Я]{1}[а-я]+\\s[А-Я]{1}[а-я]+\\s[А-Я]{1}[а-я]+$");
        Matcher matcher= pattern.matcher(name);
        try {
            if(age<0|age>100){
                throw new IncorrectInfoException("Возраст введен некорректно", age);
            }
            else {System.out.println("Возраст успешно введен");}
        }
        catch (IncorrectInfoException ex) {
            ex.printStackTrace();
        }
        try {
            if (name.length()>200| !matcher.find()) {
                throw new IncorrectInfoException("ФИО введены некорректно", name);
            }
            else {System.out.println("ФИО успешно введены");}
        }
        catch (IncorrectInfoException ex){
            ex.printStackTrace();
        }
    }
}