import java.util.Scanner;
public class ex3_2{

    public static void main(String[] args){
        System.out.println("Введите размер массива");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        while (r<=0) {
            System.out.println("Размер массива введен некорректно, попробуйте еще раз:");
            r=sc.nextInt();}
        int[] arr1=new int[r];
        System.out.println("Введите нижнюю границу диапазона включительно");
        int n=sc.nextInt();
        System.out.println("Введите верхнюю границу диапазона включительно");
        int v=sc.nextInt();
        while (n>v) {
            System.out.println("Нижняя граница больше верхней, попробуйте еще раз:");
            System.out.println("Введите нижнюю границу диапазона включительно");
            n=sc.nextInt();
            System.out.println("Введите верхнюю границу диапазона включительно");
            v=sc.nextInt();}
        for (int i=0; i<arr1.length; i++){
            arr1[i]=(int)(n+(Math.random())*(v-n+1));
            System.out.print(arr1[i]+" ");
        }
    }
}