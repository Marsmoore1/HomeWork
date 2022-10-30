import java.util.Scanner;
public class ex2_4 {
    public static void main(String[] args) {
        System.out.println("Введите первое и второе целые числа");
        System.out.println("Учтите, что первое число должно быть меньше второго");
        System.out.println("и они должны быть целыми");
        System.out.println("Введите первое число:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Введите второе число:");
        int b=sc.nextInt();
        int n=0;
        if (a>=b) {System.out.println("Второе число меньше или равно первому");}
        for (int i=(b-1);i>=(a+1);i--) {System.out.print(i+" ");
        n+=1;}
        System.out.println("");
        System.out.println("Количество выведенных чисел - "+n);

    }
}