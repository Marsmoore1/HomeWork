public class Cat extends Animal{
    public Cat(){
        super();
    }
    public Cat(String name,  int age){
        super(name, age);
    }
    @Override
    public void makeNoise(String name){
        System.out.println("Кот " + getName() + " делает мяу");
    }
}
