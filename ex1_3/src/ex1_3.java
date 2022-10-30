import java.util.Scanner;
public class ex1_3 {
    public static void main(String[] args) {
        System.out.println("Введите первое число");
        Scanner sc1 = new Scanner(System.in); //создаем сканнер для 1 числа
        int a = sc1.nextInt(); //присваиваем значению а значение сканнера 1 числа
        System.out.println("Вы ввели число " + a); //выводим на экран число
        System.out.println("Введите второе число"); //по аналогии
        int b = sc1.nextInt();
        System.out.println("Вы ввели число " + b);
        System.out.println("Введите третье число");
        int c = sc1.nextInt();
        System.out.println("Вы ввели число " + c);
        if (a < b & a < c) {
            System.out.println("Сумма двух наибольших чисел равна " + (b + c));
        } else if (b < a & b < c) {
            System.out.println("Сумма двух наибольших чисел равна " + (a + c));
        } else {
            System.out.println("Сумма двух наибольших чисел равна " + (a + b));
        }
    }
}


