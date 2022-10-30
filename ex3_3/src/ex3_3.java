import java.util.Scanner;
public class ex3_3{

    public static void main(String[] args){
        System.out.println("Введите размер массива");
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        while (N<=0) {
            System.out.println("Размер массива введен некорректно, попробуйте еще раз:");
            N=sc.nextInt();}

        int[] arr1=new int[N];
        System.out.println("Введите нижнюю границу диапазона включительно");
        int A=sc.nextInt();
        System.out.println("Введите верхнюю границу диапазона включительно");
        int B=sc.nextInt();

        while (A>B) {
            System.out.println("Нижняя граница больше верхней, попробуйте еще раз:");
            System.out.println("Введите нижнюю границу диапазона включительно");
            A=sc.nextInt();
            System.out.println("Введите верхнюю границу диапазона включительно");
            B=sc.nextInt();}
        int max=0;
        for (int i=0;i<arr1.length;i++){
            arr1[i]=(int)(A+(Math.random())*(B-A+1));
            System.out.print(arr1[i]+" ");}

        for (int i=0; i<arr1.length; i++){
            if(arr1[i]>arr1[max]){
                max=i;}
        }
        System.out.println("");
        System.out.println("Элемент массива "+arr1[max]+" является максимальным. Его индекс- "+max);
    }
}