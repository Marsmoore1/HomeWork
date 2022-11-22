import java.io.*;
import java.util.ArrayList;

public class FileUtil {
    public static boolean saveReadersList(ArrayList<Reader> readers){
        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("C:\\users\\Кирилл\\IdeaProjects\\HomeWork\\readersList.txt"))){
            oos.writeObject(readers);
        }
        catch(IOException e){
            System.out.println("Запись не удалась:");
            e.printStackTrace();
        }
        finally {System.out.println("Запись завершена успешно");}
        return true;
    }
    public static ArrayList<Reader> restoreReadersList(){
        ArrayList<Reader> readers=new ArrayList<Reader>();
        try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\users\\Кирилл\\IdeaProjects\\HomeWork\\readersList.txt"))){
            readers =(ArrayList<Reader>)ois.readObject();
        }
        catch(Exception e){
            System.out.println("Список не найден:");
            e.printStackTrace();
        }
        for(Reader i:readers)
        {System.out.println("Читатель: "+i.getName());}
        return readers;
    }
}
