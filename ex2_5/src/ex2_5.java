import java.util.Scanner;
public class ex2_5 {
    public static void main(String[] args) {
        System.out.println("Введите первое и второе целые числа");
        System.out.println("Учтите, что первое число должно быть больше второго");
        System.out.println("и они должны быть целыми");
        System.out.println("Введите первое число:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Введите второе число:");
        int b=sc.nextInt();
        int n=0;
        if (a<=b) {System.out.println("Второе число больше или равно первому");}
        for (int i=a;i>=b;i-=b) {
            n+=b;}
        System.out.println("Длина незанятой части отрезка - "+(a-n));

    }
}