public class Drum extends Instrument{
    private int size;

    public Drum (){super();}
    public Drum (int size, String KEY){
        super(KEY);
        this.size=size;
    }
    public int getSize(){
        return size;
    }
    public void setSize(int size){
        this.size=size;
    }

    @Override
    public void play() {
        System.out.println("Играет барабан размером "+getSize()+" мм в "+getKEY());
    }
}
