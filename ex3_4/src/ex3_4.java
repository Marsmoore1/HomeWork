import java.util.Scanner;
public class ex3_4{

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
        for (int i=0; i<arr.length; i++) {
            for (int k=0; k<arr.length-i-1; k++){
                if (arr[k]>arr[k+1]){
                    int j=arr[k];
                    arr[k]=arr[k+1];
                    arr[k+1]=j;
                }
            }
        }
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}