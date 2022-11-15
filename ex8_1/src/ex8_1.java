public class ex8_1 {
    public static void main(String[] args) {
        StringBuilder strB = new StringBuilder();
        int a=3;
        int b=56;
        strB.append(String.format("%d+%d=%d\n", a, b, a+b));
        strB.append(String.format("%d-%d=%d\n", a, b, a-b));
        strB.append(String.format("%d*%d=%d\n", a, b, a*b));
        System.out.println(strB);
        strB.replace(4, 5, " равно ");
        strB.replace(18, 19, " равно ");
        strB.replace(33, 34, " равно ");
        System.out.println(strB);
    }
}