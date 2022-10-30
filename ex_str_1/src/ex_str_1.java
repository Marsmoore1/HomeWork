import java.util.Scanner;
public class ex_str_1{

    public static void main(String[] args){
        System.out.println("Введите строку");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("Вы ввели строку "+str);
        System.out.println("Введите символ");
        String symb=sc.nextLine();
        System.out.println("Вы ввели символ "+symb);
        char[] arr=str.toCharArray();
        char symb1=symb.charAt(0);
        int count=0;
        boolean check=false;
        for (int i=0; i<arr.length-1;i++){
            if(symb1==arr[i]){
                count++;
                check=true;
            }
        }
        if (check) {
            System.out.println("Вхождений символа в строку:"+count);
        }
        else {
            System.out.println("Введенный символ отсутствует в строке");
        }
    }
}