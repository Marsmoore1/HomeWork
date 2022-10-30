import java.util.Scanner;
public class ex1_8 {
    public static void main(String[] args) {
        System.out.println("Введите номер карты (от 6 до 14, где 11-это валет, а 14-туз соответственно):");
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        if (n<6|n>14) {System.out.println ("Неверный номер карты!");}
        System.out.println("Введите масть карты (1-пики, 2-трефы, 3-бубны, 4-червы):");
        int m=sc.nextInt();
        if (m<1|m>4) {System.out.println("Неверная масть карты!");}
        if (n>=6&n<=14&m>=1&m<=4) {System.out.print("Ваша карта: ");}
        switch (n) {
            case 6: System.out.print("шестерка "); break;
            case 7: System.out.print("семерка "); break;
            case 8: System.out.print("восьмерка "); break;
            case 9: System.out.print("девятка "); break;
            case 10: System.out.print("десятка "); break;
            case 11: System.out.print("валет "); break;
            case 12: System.out.print("дама "); break;
            case 13: System.out.print("король "); break;
            case 14: System.out.print("туз "); break;
        }
        switch (m) {
            case 1: System.out.print("пик."); break;
            case 2: System.out.print("треф."); break;
            case 3: System.out.print("бубен."); break;
            case 4: System.out.print("червей."); break;
        }

    }
}