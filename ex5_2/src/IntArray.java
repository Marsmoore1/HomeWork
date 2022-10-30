public class IntArray {
    private int[] arr;
//конструкторы
    public IntArray(int[] arr){
        this.arr =arr;
    }
    public IntArray(int i){
        arr = new int [i];
    }
    public IntArray(){
        arr = new int [10];
    }
//методы
    //Сортировка пузырьком по возрастанию
    public void sort(int s) {
        if (s>0){
            int save;
            for (int i = 0; i < arr.length ; i++) {
                for (int j = 0; j < arr.length-1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        save = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = save;

                    }
                }
            }
        }
    //сортировка по убыванию
        else {
            int save;
            for (int i = 0; i < arr.length ; i++) {
                for (int j = 0; j < arr.length-1; j++) {
                    if (arr[j] < arr[j + 1]) {
                        save = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = save;
                    }
                }
            }
        }
    }
    public void view () {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
//геттеры
    public int getArrLength (){
        return arr.length;
    }
    public int[] getArr (){
        return arr;
    }
    public void setArr (int[] arr){
        this.arr=arr;
    }
    public int getArray (int i){
        return arr[i];
    }
    public void setArray (int b,int i){
        this.arr[i]=b;
    }
}
