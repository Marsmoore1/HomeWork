import java.util.Scanner;

public class ex1_7 {

    public static void main(String[] args) {

        System.out.println("Введите день месяца от 1 до 31:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Введите число месяца от 1 до 12:");
        int b = sc.nextInt();
        if (a<1|a>31) {System.out.println("Некорректный день месяца");}
        if (b<1|b>12) {System.out.println("Некорректный месяц");}
        if (a>=20 & a<=31 & b==1) { //ВОДОЛЕЙ
            System.out.print ("Знак зодиака для данной даты - Водолей");
        }
        if (a>=1 & a<=18 & b==2) { //ВОДОЛЕЙ2
            System.out.print ("Знак зодиака для данной даты - Водолей");
        }
        if (a>=19 & a<=31 & b==2) { //РЫБЫ
            System.out.print ("Знак зодиака для данной даты - Рыбы");
        }
        if (a>=1 & a<=20 & b==3) { //РЫБЫ2
            System.out.print ("Знак зодиака для данной даты - Рыбы");
        }
        if (a>=21 & a<=31 & b==3) { //ОВЕН
            System.out.print ("Знак зодиака для данной даты - Овен");
        }
        if (a>=1 & a<=19 & b==4) { //ОВЕН2
            System.out.print ("Знак зодиака для данной даты - Овен");
        }
        if (a>=20 & a<=31 & b==4) { //ТЕЛЕЦ
            System.out.print ("Знак зодиака для данной даты - Телец");
        }
        if (a>=1 & a<=20 & b==5) { //ТЕЛЕЦ2
            System.out.print ("Знак зодиака для данной даты - Телец");
        }
        if (a>=21 & a<=31 & b==5) { //БЛИЗНЕЦЫ
            System.out.print ("Знак зодиака для данной даты - Близнецы");
        }
        if (a>=1 & a<=31 & b==6) { //БЛИЗНЕЦЫ2
            System.out.print ("Знак зодиака для данной даты - Близнецы");
        }
        if (a>=1 & a<=22 & b==7) { //БЛИЗНЕЦЫ3
            System.out.print ("Знак зодиака для данной даты - Близнецы");
        }
        if (a>=23 & a<=31 & b==7) { //ЛЕВ
            System.out.print ("Знак зодиака для данной даты - Лев");
        }
        if (a>=1 & a<=22 & b==8) { //ЛЕВ2
            System.out.print ("Знак зодиака для данной даты - Лев");
        }
        if (a>=23 & a<=31 & b==8) { //ДЕВА
            System.out.print ("Знак зодиака для данной даты - Дева");
        }
        if (a>=1 & a<=22 & b==9) { //ДЕВА2
            System.out.print ("Знак зодиака для данной даты - Дева");
        }
        if (a>=23 & a<=31 & b==9) { //ВЕСЫ
            System.out.print ("Знак зодиака для данной даты - Весы");
        }
        if (a>=1 & a<=22 & b==10) { //ВЕСЫ2
            System.out.print ("Знак зодиака для данной даты - Весы");
        }
        if (a>=23 & a<=31 & b==10) { //СКОРПИОН
            System.out.print ("Знак зодиака для данной даты - Скорпион");
        }
        if (a>=1 & a<=22 & b==11) { //СКОРПИОН2
            System.out.print ("Знак зодиака для данной даты - Скорпион");
        }
        if (a>=23 & a<=31 & b==11) { //СТРЕЛЕЦ
            System.out.print ("Знак зодиака для данной даты - Стрелец");
        }
        if (a>=1 & a<=21 & b==12) { //СТРЕЛЕЦ2
            System.out.print ("Знак зодиака для данной даты - Стрелец");
        }
        if (a>=22 & a<=31 & b==12) { //КОЗЕРОГ
            System.out.print ("Знак зодиака для данной даты - Козерог");
        }
        if (a>=1 & a<=19 & b==1) { //КОЗЕРОГ2
            System.out.print ("Знак зодиака для данной даты - Козерог");
        }

    }
}