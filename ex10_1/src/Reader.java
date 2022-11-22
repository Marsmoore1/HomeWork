import java.io.Serializable;
import java.util.LinkedList;
public class Reader implements Serializable {
    String name, surname, dadName, faculty, birthDate, phone;
    int tickNumber;
    LinkedList<Book> bookList=new LinkedList<Book>(); //создаем коллекцию из экземпляров класса Book

    Reader() {
    }
    public void takeBook(Book book){
        if(bookList.size()<10) {
            bookList.add(book);
            System.out.println(getFIO()+"взял книгу: "+book.getName());
            return;
        }
        else if (bookList.size()==10){
            System.out.println("Читатель уже имеет на руках 10 книг");
        }
    }
    public String getFIO(){
        return name +" "+ surname.charAt(0)+"."+ dadName.charAt(0)+". ";
    }
    public Book returnBook(String bookName){
        Book ret=null;
        for(int i=0; i<bookList.size();i++){
            if(bookList.get(i)!=null&&bookList.get(i).getName().equals(bookName)) {
                ret=bookList.get(i);
                for(int j=i;j<bookList.size()-1; j++){
                    bookList.set(j, bookList.get(j+1));
                }
                bookList.remove(bookList.size()-1);
                break;
            }
        }
        if (ret==null) {
            System.out.println(getFIO()+". не брал книгу: "+bookName);
        }
        else System.out.println(getFIO()+"вернул книгу "+bookName);
        return ret;
    }
    public void printStatus(){
        String booksString="";
        int count=0;
        for (Book b:bookList){
            if(b!=null){
                booksString+=b.getName()+", ";
                count++;
            }
        }
        if (count==0){
            System.out.println(getFIO()+" не брал книг");
        }
        else {
            System.out.println(getFIO()+" взял "+count+" книг: "+booksString);
        }
    }
    public String getName(){return name;}
    public void setName (String name) {this.name=name;}

    public String getSurname (){return surname;}
    public void setSurname (String surname) {this.surname=surname;}

    public String getDadName (){return dadName;}
    public void setDadName (String dadName) {this.dadName=dadName;}

    public String getFaculty (){return faculty;}
    public void setFaculty (String faculty) {this.faculty=faculty;}

    public String getBirthDate (){return birthDate;}
    public void setBirthDate (String birthDate) {this.birthDate=birthDate;}

    public String getPhone(){return phone;}
    public void setPhone (String phone) {this.phone=phone;}

    public int getTickNumber(){return tickNumber;}
    public void setTickNumber (int tickNumber) {this.tickNumber=tickNumber;}
}
