public class ex3_1 {
    public static void main(String[] args) {
       int[] arr=new int[4];
       int count=0;
       for (int i=0; i<arr.length; i++) {
           int a=(int)(10+Math.random()*90);
           arr[i]=a;
           System.out.print(arr[i]+" ");}
       for (int i=0; i<arr.length-1; i++) {
           if (arr[i]<arr[i+1]) {count++;}
       }
       System.out.println("");
       if (count==arr.length-1) {System.out.println("Массив является строговозрастающим");}
       else {System.out.println("Массив не является строговозрастающим");}
    }
}