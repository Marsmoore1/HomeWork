public class Tuba extends Instrument{
    private int diam;
    public Tuba (){super();}
    public Tuba(int diam, String KEY){
        super (KEY);
        this.diam=diam;
    }
    public int getDiam(){
        return diam;
    }
    public void setDiam(int diam){
        this.diam=diam;
    }
    @Override
    public void play(){
        System.out.println("Играет труба диаметром "+getDiam()+" мм в "+getKEY());
    }
}
