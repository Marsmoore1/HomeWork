import java.util.Scanner;
public class ex3_7{

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
        }//создали и вывели массив

        System.out.println(" ");
        for (int i=0; i<arr.length; i++) {
            for (int k=0; k<arr.length-i-1; k++){
                if (arr[k]>arr[k+1]){
                    int j=arr[k];
                    arr[k]=arr[k+1];
                    arr[k+1]=j;
                }
            }
        } /*сортируем массив для будущего двоичного поиска (массив должен быть идентичен для обоих поисков */

        System.out.println(" ");
        System.out.println("Массив был отсортирован по возрастанию для чистоты эксперимента");

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");

        System.out.println("Введите число для проверки его наличия в массиве");
        int k=sc.nextInt();
        int j=-1;
        int count1=0;
        int count2=0;
        boolean have=false;
        for(int i=0; i<arr.length; i++){
            count1++;
            if(arr[i]==k){
                j=i;
                have=true;
                System.out.println("Индекс искомого числа линейным поиском: "+j);
                break;}
        }//линейный поиск числа
        if (have==false) {System.out.println("Числа "+k+" нет в данном массиве");} //если числа нет, можно сразу об этом написать

        int maxInd=arr.length-1;
        int elemInd=-1;
        int minInd=0;
        while (minInd<=maxInd) {
            count2++;
            int midInd=(maxInd+minInd)/2;
            if (k==arr[midInd]){
                elemInd=midInd;
                break;
            }
            else if (k<arr[midInd]){
                maxInd=midInd-1;
            }
            else if (k>arr[midInd]){
                minInd=midInd+1;
            }
        }//двоичный поиск
        if (have==true){
            System.out.println("Индекс искомого числа двоичным поиском: "+elemInd);
            System.out.println("Линейный поиск: "+count1+" шаг(-ов)");
            System.out.println("Двоичный поиск: "+count2+" шаг(-ов)");
        }
    }
}