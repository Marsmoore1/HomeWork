import java.util.Scanner;
public class Reader {
    Scanner sc=new Scanner(System.in);
    String name, surname, dadName, faculty, birthDate, phone;
    int tickNumber;
    Book [] bookList=new Book[10];//создаем массив из 10 экземпляров класса Book

    Reader() {
    }
    public void takeBook(Book book){
        for (int i=0; i<bookList.length;i++){
            if(bookList[i]==null) {
                bookList[i]=book;
                System.out.println(getFIO()+"взял книгу: "+book.getName());
                return;
            }
        }
        System.out.println("Читатель уже имеет на руках 10 книг");
    }
    public String getFIO(){
        return name +" "+ surname.charAt(0)+"."+ dadName.charAt(0)+". ";
    }
    public Book returnBook(String bookName){
        Book ret=null;
        for(int i=0; i<bookList.length;i++){
            if(bookList[i]!=null&&bookList[i].getName().equals(bookName)) {
                ret=bookList[i];
                for(int j=i;j<bookList.length-1; j++){
                    bookList[j]=bookList[j+1];
                }
                bookList[bookList.length-1]=null;
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
