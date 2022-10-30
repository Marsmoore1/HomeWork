import java.util.Scanner;

public class ex1_6{

    public static void main(String[] args) {

        System.out.println("Введите целое число от 0 до 999 включительно");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if (a<10&0<=a) {System.out.print("Число "+a+" - простое");}
        else if (a<100&10<=a){System.out.print("Число "+a+" - двузначное");}
        else if (a<1000&100<=a){System.out.print("Число "+a+" - трехзначное");}
        if (a<0|a>=1000){System.out.println("Вы ввели число вне диапазона");}
        if (a%2==0&a>=0&a<1000) {System.out.print(" четное");}
        else if (a%2>0&a>=0&a<1000) {System.out.print(" нечетное");}



    }
}