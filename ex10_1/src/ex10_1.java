import java.util.ArrayList;
import java.util.Scanner;
public class ex10_1 {
    public static void main(String[] args) {
        FileUtil.restoreReadersList();
        Scanner sc=new Scanner(System.in);
        ArrayList<Reader>readers= new ArrayList<Reader>();
        int choose;
        do {
            System.out.println("Выберите действие:");
            System.out.println("1-Добавить нового читателя");
            System.out.println("2-Читатель хочет взять книгу");
            System.out.println("3-Читатель хочет вернуть книгу");
            System.out.println("4-Вывести статус читателя");
            System.out.println("5-Вывести статус всех читателей");
            System.out.println("6-Выйти из программы");
            choose=sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1: {
                    if (readers.size()<10) {
                        readers.add(newReader(readers, sc));
                        break;
                    }
                    else if (readers.size()==10) {
                        System.out.println("Превышено количество читателей");
                    }
                    break;
                }
                case 2: {
                    System.out.println("Введите номер читательского билета");
                    int tickNumber = sc.nextInt();
                    sc.nextLine();
                    boolean found = false;
                    for (Reader r: readers) {
                        if (r != null && r.getTickNumber() == tickNumber) {
                            found = true;
                            r.takeBook(newBook(sc));
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Такого читателя нет");
                    }
                    break;
                }
                case 3: {
                    System.out.println("Укажите название книги, которую желаете вернуть");
                    String bookName = sc.nextLine();
                    System.out.println("Введите номер читательского билета");
                    int tickNumber = sc.nextInt();
                    sc.nextLine();
                    boolean found = false;
                    for (Reader r: readers) {
                        if (r != null && r.getTickNumber() == tickNumber) {
                            found = true;
                            r.returnBook(bookName);
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Такого пользователя нет");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Введите номер читательского билета");
                    int tickNumber = sc.nextInt();
                    sc.nextLine();
                    boolean found = false;
                    for (Reader r:readers) {
                        if (r != null && r.getTickNumber() == tickNumber) {
                            found = true;
                            r.printStatus();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Такого читателя нет");
                    }
                    break;
                }
                case 5: {
                    for (Reader r: readers) {
                        if (r != null){
                            r.printStatus();
                        }
                    }
                }
                case 6: {
                    System.out.println("Завершить программу");
                    break;

                }
                default: {
                    System.out.println("Нет такой команды");
                }

            }
        }
        while (choose !=6);
        FileUtil.saveReadersList(readers);
    }
    private static Reader newReader(ArrayList<Reader> readers, Scanner sc){
        Reader reader=new Reader();
        System.out.println("Введите имя");
        reader.setName(sc.nextLine());
        System.out.println("ВВедите фамилию");
        reader.setSurname(sc.nextLine());
        System.out.println("Введите отчество");
        reader.setDadName(sc.nextLine());
        System.out.println("Введите номер билета");
        boolean isNumberFree;
        int tickNumber;
        do {
            tickNumber=sc.nextInt();
            sc.nextLine();
            isNumberFree=true;
            for(Reader r: readers){
                if(r!=null && r.getTickNumber()==tickNumber) {
                    System.out.println("Введите номер билета повторно");
                    isNumberFree=false;
                }
            }
        }
        while (!isNumberFree);
        reader.setTickNumber(tickNumber);

        System.out.println("Введите название факультета");
        reader.setFaculty(sc.nextLine());

        System.out.println("Введите дату рождения");
        reader.setBirthDate(sc.nextLine());

        System.out.println("Введите номер телефона");
        reader.setPhone(sc.nextLine());

        return reader;
    }
    private static Book newBook (Scanner sc){
        Book book=new Book();
        System.out.println("Введите название книги");
        book.setName(sc.nextLine());

        System.out.println("Введите имя автора");
        book.setAuthorName(sc.nextLine());

        System.out.println("Введите содержание");
        book.setText(sc.nextLine());
        return book;
    }
}