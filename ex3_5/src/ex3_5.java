import java.util.Scanner;
public class ex3_5{

    public static void main(String[] args){
        int[]arr=new int[20];
        int a,b;
        a=1;
        b=20;
        System.out.println("Массив ниже");
        for(int i=0; i<arr.length;i++){
            arr[i]=(int)(a+Math.random()*(b-a+1));
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        System.out.println("Введите число для проверки его наличия в массиве");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=-1;
        boolean have=false;
        System.out.println("Если число "+n+" есть в массиве, его индекс(-ы) ниже: ");
        for(int i=0; i<arr.length; i++){
            if(arr[i]==n){
                k=i;
                have=true;
                System.out.print(k+" ");
                }
        }
        if (have==false) {System.out.println("Числа "+n+" нет в данном массиве");}
    }
}