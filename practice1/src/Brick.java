public class Brick {
    private static int smallBrick=1, bigBrick=5;
    public Brick (){};

    public void makeBricks(int smallCount, int bigCount, int rowLength) {
        boolean check = false;
        if ((smallCount*smallBrick) + (bigCount*bigBrick) >= rowLength) {
            check = true;
        } else if ((smallCount*smallBrick) + (bigCount*bigBrick) < 0) {
            System.out.println("Длина ряда кирпичей не может быть меньше нуля");
        }
        System.out.println("Создание ряда длиной " + rowLength + " из " + smallCount + " малых кипичей и " + bigCount + " больших кирпичей - " + check);
    }
    
    public int getSmallBrick() {
        return smallBrick;
    }
    public void setSmallBrick(int smallBrick){
        this.smallBrick=smallBrick;
    }
    public int getBigBrick(){
        return bigBrick;
    }
    public void setBigBrick(int bigBrick) {
        this.bigBrick = bigBrick;
    }
}
