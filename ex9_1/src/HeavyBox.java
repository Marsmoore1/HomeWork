public class HeavyBox {
    private String owner;
    private int weigth;

    public HeavyBox(){}
    public HeavyBox (String owner, int weigth){
        this.owner=owner;
        this.weigth=weigth;
    }
    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }
    public String getOwner(){
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    @Override
    public String toString(){
        return String.format("owner = %s; weigth = %d", owner, weigth);
    }
}
