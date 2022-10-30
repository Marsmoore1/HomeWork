import java.util.Scanner;
public class exercise1_1 {
    public static void main(String[] args) {
        System.out.println("Введите целое число");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (n%2==0) {
            System.out.println("Число " +n+ " четное");
        }
        else {
            System.out.println("Число " +n+" не является четным");
        }
    }
}