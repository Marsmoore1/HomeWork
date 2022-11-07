public abstract class Instrument {
    private String KEY="До мажор";
    public Instrument (){};
    public Instrument(String KEY){
        this.KEY=KEY;
    }
    public abstract void play();

    public String getKEY(){
        return KEY;
    }
    public void setKEY(String KEY){
        this.KEY=KEY;
    }
}
