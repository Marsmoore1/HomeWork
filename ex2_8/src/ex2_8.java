import java.util.Scanner;
public class ex2_8 {
    public static void main(String[] args) {
        System.out.println("Введите значение процентного вклада:");
        Scanner sc=new Scanner (System.in);
        double p=sc.nextDouble(); //выводим вещественный процент
        boolean i=false;
        if (p<=0) {
            i=true;
            System.out.println ("Размер процентного вклада ниже допустимого");}
        else if(p>=25) {
            i=true;
            System.out.println ("Размер процентного вклада выше допустимого");}
        p=p/100;//Конвертируем введенный процент в настоящий:)
        double v=1000; //начальный вклад
        double f=1100; //Контрольный вклад
        double s=v; //текущий размер вклада
        int m=0; //значение для месяца
        if (!i) {while (s<=f){
                s=s+(s*p);
                m++;
                }
                System.out.println("Размер вклада превысит "+f+" руб. через "+m+" месяцев");
                System.out.println("Вклад через "+m+" месяцев составит "+s+" руб.");
        }
    }
}