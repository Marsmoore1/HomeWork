import java.util.Scanner;
public class ex5_1 {
    public static void main(String[] args) {
//Первый экземпляр
        Phone ph1=new Phone();
        System.out.println("Введите номер телефона");
        Scanner sc=new Scanner(System.in);
        ph1.setNumber(sc.nextInt());
        System.out.println("Введенный номер: "+ph1.getNumber());
        sc.nextLine();

        System.out.println("Введите модель телефона");
        ph1.setModel(sc.nextLine());
        System.out.println("Введеная модель: "+ph1.getModel());

        System.out.println("Введите вес телефона в граммах");
        ph1.setWeigth(sc.nextDouble());
        System.out.println("Введенный вес: "+ph1.getWeigth()+" граммов");
//Второй экземпляр
        Phone ph2=new Phone();
        System.out.println("Введите номер телефона");
        ph2.setNumber(sc.nextInt());
        System.out.println("Введенный номер: "+ph2.getNumber());
        sc.nextLine();

        System.out.println("Введите модель телефона");
        ph2.setModel(sc.nextLine());
        System.out.println("Введеная модель: "+ph2.getModel());

        System.out.println("Введите вес телефона в граммах");
        ph2.setWeigth(sc.nextDouble());
        System.out.println("Введенный вес: "+ph2.getWeigth()+" граммов");
//Третий экземпляр
        Phone ph3=new Phone();
        System.out.println("Введите номер телефона");
        ph3.setNumber(sc.nextInt());
        System.out.println("Введенный номер: "+ph3.getNumber());
        sc.nextLine();

        System.out.println("Введите модель телефона");
        ph3.setModel(sc.nextLine());
        System.out.println("Введеная модель: "+ph3.getModel());

        System.out.println("Введите вес телефона в граммах");
        ph3.setWeigth(sc.nextDouble());
        System.out.println("Введенный вес: "+ph3.getWeigth()+" граммов");
//Остальной код
        System.out.println(ph1.phoneInfo());
        System.out.println(ph2.phoneInfo());
        System.out.println(ph3.phoneInfo());

        System.out.println(ph1.receiveCall("Кирюха")+" по номеру "+ph1.getNumber());
        System.out.println(ph2.receiveCall("Колян")+" по номеру "+ph2.getNumber());
        System.out.println(ph3.receiveCall("Начальник")+" по номеру "+ph3.getNumber());

        System.out.println(ph1.receiveCall("Костян", 293547812));
        ph1.sendMessage(25536, 245654, 456546, 85462112);
    }
}