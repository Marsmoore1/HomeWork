import java.util.ArrayList;

public class ex9_1 {
    public static void main(String[] args) {
        ArrayList <HeavyBox> boxes=new ArrayList<HeavyBox>();
        HeavyBox box1=new HeavyBox("Никита", 32);
        HeavyBox box2=new HeavyBox("Кирилл", 90);
        HeavyBox box3=new HeavyBox("Анорексик", 5);
        boxes.add(box1);
        boxes.add(box2);
        boxes.add(box3);
        for (HeavyBox box:boxes){
            System.out.println(box.toString()); //выводим элементы коллекции
        }
        box1.setWeigth(box1.getWeigth()+1);//изменили вес 1го ящика на 1
        for (HeavyBox box:boxes){
            System.out.println(box.toString()); //выводим элементы коллекции
        }
        boxes.remove(boxes.size()-1);//удалили последний ящик
        for (HeavyBox box:boxes){
            System.out.println(box.toString()); //выводим элементы коллекции
        }
        boxes.clear();
        System.out.println("Список коробок пуст?-"+boxes.isEmpty());
    }
}