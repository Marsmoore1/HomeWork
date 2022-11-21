import java.util.HashMap;
import java.util.Map;

public class Transform <T>{
    private T[] arr;

    public Transform(){}
    public Transform(T[]arr){
        this.arr=arr;
    }
    public <T>Map<T, Integer> arrayToMap(T[] arr){
        Map<T, Integer> map=new HashMap<T, Integer>();
        for (int i=0; i<arr.length; i++){
            int count=1;
            if (map.containsKey(arr[i])){
                map.replace(arr[i], map.get(arr[i])+1);
            }
            else{map.put(arr[i], count);}
        }
        return map;
    }

    public T getElem(int i){
        return arr[i];
    }
}
