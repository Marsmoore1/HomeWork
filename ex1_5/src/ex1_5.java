import java.util.Scanner;
public class ex1_5 {
    public static void main(String[] args) {
        System.out.println("Введите число A: ");
        Scanner sc=new Scanner(System.in);
        double A=sc.nextDouble();
        System.out.println("Введите число B: ");
        double B=sc.nextDouble();
        if (B==0) {
            System.out.println("Число B не может быть равным нулю ");
        }
        System.out.println("Введите номер операции " + "(1-сложение; 2-вычитание; 3-умножение; 4-деление): ");
        int N=sc.nextInt();
        switch(N) {
            case 1: System.out.println("Сумма чисел A и B равна "+(A+B)); break;
            case 2: System.out.println("Разность чисел A и B равна "+(A-B)); break;
            case 3: System.out.println("Произведение чисел A и B равно "+(A*B)); break;
            case 4: System.out.println("Частное от деления чисел A и B равно "+(A/B)); break;
            default: System.out.println("Номер операции введен некорректно");
        }
    }
}