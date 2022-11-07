public class Dog extends Animal {
    public Dog(){
        super();
    }
    public Dog(String name,  int age){
        super(name, age);
    }
    @Override
    public void makeNoise(String name){
        System.out.println("Собака " + getName() + " делает гав");
    }
}
