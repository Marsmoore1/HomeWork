public class Rat extends Animal {
    public Rat(){
        super();
    }
    public Rat(String name,  int age){
        super(name, age);
    }
    @Override
    public void makeNoise(String name){
        System.out.println("Крыса " + getName() + " делает скр-скр");
    }
}
