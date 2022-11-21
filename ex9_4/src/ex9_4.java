public class ex9_4 {
    public static void main(String[] args) {
        Integer[]arr={5,5,6,6,3,4,7,7,8};
        Transform<Integer> trans=new Transform(arr);
        System.out.println(trans.arrayToMap(arr));
        String[]arr1={"KU", "KUKU", "KU", "KUKUKU", "KUKU", "KU"};
        System.out.println(trans.arrayToMap(arr1));
    }

}