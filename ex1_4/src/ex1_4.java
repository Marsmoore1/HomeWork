import java.util.Scanner;
public class ex1_4 {
    public static void main(String[] args) {
        System.out.println("Введите номер года:");
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        if ((n%100==0)&(n%400>0)&(n%4==0)){
            System.out.println("Количество дней в "+n+" году: 365");
        }
        else if (n<=0) {
            System.out.println("Год введен неверно");
        }
        else if (n%4==0){
            System.out.print("Количество дней в "+n+" году: 366, так как год високосный");
        }
        else {
            System.out.println("Количество дней в "+n+" году: 365");
        }
    }
}