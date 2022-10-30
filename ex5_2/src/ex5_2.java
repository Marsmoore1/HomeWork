import java.util.Scanner;
public class ex5_2 {
    public static void main(String[] args) {
        IntArray arr = new IntArray();
        int a, b;

        System.out.println("Введите минимальное число массива: ");
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        System.out.println("Введите максимальное число массива: ");
        b = scan.nextInt();
        System.out.println();

        for (int i = 0; i < arr.getArrLength(); i++) {
            arr.setArray((int) ((Math.random() * (b - a)) + a), i);

        }
        System.out.println("Массив 1: ");
        arr.view();
        System.out.println();
        System.out.println("Введите число для сортировки (<=0-убывание, >0- возрастание)");
        int vvod=scan.nextInt();
        arr.sort(vvod);
        arr.view();
        System.out.println();
        System.out.println();

        System.out.println("Введите количество элементов второго массива");
        vvod=scan.nextInt();
        IntArray arr2 = new IntArray(vvod);
        System.out.println("Массив 2: ");

        for (int i = 0; i < arr2.getArrLength(); i++) {
            arr2.setArray((int) ((Math.random() * (b - a)) + a), i);
        }
        arr2.view();
        System.out.println();
        System.out.println("Введите число для сортировки (<=0-убывание, >0- возрастание)");
        vvod=scan.nextInt();
        arr2.sort(vvod);
        scan.nextLine();
        arr2.view();
        System.out.println();

        int[] arr3 = new int[10];
        System.out.println();
        System.out.println("Массив 3: ");

        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = ((int) ((Math.random() * (b - a)) + a));
        }
        IntArray arr4 = new IntArray(arr3);
        arr4.view();
        System.out.println();
        System.out.println("Введите число для сортировки (<=0-убывание, >0- возрастание)");
        vvod=scan.nextInt();
        arr4.sort(vvod);
        arr4.view();
    }
}