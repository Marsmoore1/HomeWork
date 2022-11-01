import java.util.Scanner;
public class practice1 {
    public static void main(String[] args) {
        Brick bricks=new Brick();
        System.out.println("Введите количество маленьких кирпичей");
        Scanner sc=new Scanner(System.in);
        int smallCount=sc.nextInt();
        System.out.println("Введите количество больших кирпичей");
        int bigCount=sc.nextInt();
        System.out.println("Введите размер желаемого ряда");
        int rowLength=sc.nextInt();
        bricks.makeBricks(smallCount, bigCount, rowLength);
    }
}