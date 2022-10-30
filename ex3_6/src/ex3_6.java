import java.util.Scanner;
public class ex3_6{

    public static void main(String[] args){
        System.out.println("Введите размер массива");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Введите нижнюю границу диапазона включительно");
        int a=sc.nextInt();
        System.out.println("Введите верхнюю границу диапазона включительно");
        int b=sc.nextInt();
        for (int i=0; i<arr.length; i++){
            arr[i]=(int)(a+(Math.random())*(b-a+1));
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");

        for (int i=0; i<arr.length/2; i++) {
            int j=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=j;
        }
        System.out.println("Инвертирование данного массива представлено ниже");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");}
    }
}