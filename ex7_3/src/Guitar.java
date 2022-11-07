public class Guitar extends Instrument{
    private int countOfStrings;
    public Guitar(){super();};
    public Guitar (int countOfStrings, String KEY){
        super(KEY);
        this.countOfStrings=countOfStrings;
    }
    public int getCountOfStrings(){
        return countOfStrings;
    }
    public void setCountOfStrings(int countOfStrings){
        this.countOfStrings=countOfStrings;
    }

    @Override
    public void play(){
        System.out.println("Играет гитара с количеством струн "+getCountOfStrings()+ " в "+getKEY());
    }

}
