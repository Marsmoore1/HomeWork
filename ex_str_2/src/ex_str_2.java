import java.util.Scanner;
public class ex_str_2 {

    public static void main(String[] args) {
        System.out.println("Введите строку");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        while (str.isEmpty()){
            System.out.println("Строка пустая, повторите ввод");
            String str1 = sc.nextLine();
            str=str1;
        }
        System.out.println("Вы ввели строку: "+str);
        char[] arr=str.toCharArray();
        System.out.println("Введите символ, который хотите заменить");
        String a=sc.nextLine();
        char symbA=a.charAt(0);
        System.out.println("Введите символ, на который хотите заменить"+a);
        String b=sc.nextLine();
        char symbB=b.charAt(0);
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==symbA) {
                arr[i]=symbB;
            }
        }
        System.out.println("После замены символов строка будет выглядеть так:");
        for(int i=0; i<arr.length;i++) {
            System.out.print(arr[i]);
        }
    }
}
