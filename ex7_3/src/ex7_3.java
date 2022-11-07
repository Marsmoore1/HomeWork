public class ex7_3 {
    public static void main(String[] args) {
        Guitar guitar1=new Guitar(6,"До мажор");
        Drum drum1=new Drum(20, "До мажор");
        Tuba tuba1=new Tuba(40, "Ля минор");
        Guitar guitar2=new Guitar(12,"Ре бимоль мажор");
        Drum drum2=new Drum(35, "Ми Минор");
        Tuba tuba2=new Tuba(25, "До мажор");
        Instrument[] instruments=new Instrument[6];
        instruments[0]=guitar1;
        instruments[1]=tuba1;
        instruments[2]=guitar2;
        instruments[3]=drum2;
        instruments[4]=tuba2;
        instruments[5]=drum1;
        for (int i=0; i<instruments.length;i++){
            instruments[i].play();
        }
    }
}