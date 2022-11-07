public class ex7_1 {
    public static void main(String[] args) {
        Cat c1=new Cat("Мурзик", 6);
        Dog d1=new Dog("Суслик", 12);
        Rat r1=new Rat("Гоша", 3);
        c1.makeNoise(c1.getName());
        d1.makeNoise(d1.getName());
        r1.makeNoise(r1.getName());
    }
}