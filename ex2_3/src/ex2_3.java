import java.util.Scanner;
public class ex2_3 {
    public static void main(String[] args) {
        System.out.println("Введите число для расчета факториала: ");
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int f=1;
        if (i<0) {System.out.println("Число для расчёта факториала не может быть меньше 0");}
        for (int m=1;m<=i&i>=0;m++) {
            f*=m;}
        if (i>=0){System.out.print ("Факториал "+i+" равен "+f);}

    }
}