public class IncorrectInfoException extends Exception{
    private int age;
    private String fio;
    public IncorrectInfoException(){}
    public IncorrectInfoException(String message, int age) {
        super(message);
        this.age=age;
    }
    public IncorrectInfoException(String message, String fio) {
        super(message);
        this.fio=fio;
    }
    public int getAge() {
        return age;
    }
    public String getFio() {
        return fio;
    }
}
