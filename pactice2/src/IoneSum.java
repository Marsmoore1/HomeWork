public class IoneSum {
    private int a,b,c;
    public int IoneSum(int a, int b, int c){
        int a1=a, b1=b, c1=c;
        if (a==b){
            a1=0; b1=0;
        }
        if (b==c) {
            b1=0; c1=0;
        }
        if (a==c){
            a1=0; c1=0;
        }
        if (a==b&&b==c) {
            a1=0; b1=0; c1=0;
        }
        a=a1; b=b1; c=c1;
        return a+b+c;
    }
}
