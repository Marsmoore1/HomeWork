public class Phone {
    private int number;
    private String model, name;
    private double weigth;

    public Phone(){}
    public Phone(int number, String model, double weight){
        this(number, model);
        this.weigth=weight;
    }
    public Phone(int number, String model){
        this.number=number;
        this.model=model;
    }

    public String phoneInfo(){
        return "Телефон с номером "+number+" модели "+model+" весом "+weigth+" граммов";
    }
    public String receiveCall(String name){
        this.name=name;
        return "Звонит " +name;
    }
    public String receiveCall(String name, int number){
        return "Звонок от "+name+" по номеру "+number;
    }
    public void sendMessage(int...number){
        System.out.println("Ваши сообщения отправятся по номерам: ");
        for (int i=0; i<number.length; i++){
            System.out.println(number[i]+"; ");
        }
    }
//Геттеры и сеттеры
    public int getNumber (){
        return number;
    }
    public void setNumber (int number){
        this.number=number;
    }
    public String getModel(){
        return model;
    }
    public void setModel (String model){
        this.model=model;
    }
    public double getWeigth(){
        return weigth;
    }
    public void setWeigth(double weigth){
        this.weigth=weigth;
    }

}
