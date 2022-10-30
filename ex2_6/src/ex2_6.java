import java.util.Scanner;
public class ex2_6 {
    public static void main(String[] args) {
        System.out.println("Введите три целых числа");
        System.out.println("Введите первое число:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Введите второе число:");
        int b=sc.nextInt();
        System.out.println("Введите третье число:");
        int c=sc.nextInt();
        int n=0;
        int m=0;
        for (int i=a;i>=c;i-=c) {
            n+=1;}
        for (int i=b;i>=c;i-=c) {
            m+=1;}

        System.out.println("Количество вмещаемых квадратов - "+(n*m));

    }
}