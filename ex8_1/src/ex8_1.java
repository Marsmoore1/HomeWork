public class ex8_1 {
    public static void main(String[] args) {
        StringBuilder strB = new StringBuilder("3+56");
        System.out.println(strB.toString());
        strB.append("=59");
        System.out.println(strB.toString());
        strB.replace(1, 2, "-");
        strB.replace(5, 7, "-53");
        System.out.println(strB.toString());
        strB.replace(1, 2, "*");
        strB.replace(5, 8, "168");
        System.out.println(strB.toString());
        strB.replace(4, 5, " равно ");
        System.out.println(strB.toString());
    }
}