import java.util.HashMap;
import java.util.Map;

public class ex9_3 {
    public static void main(String[] args) {
        Map<Integer, Product> map=new HashMap<Integer,Product>();
        map.put(1, new Product("Квартира"));
        map.put(2, new Product("Машина"));
        map.put(3, new Product("Гараж"));

        getKeyProdName(map);
        getProdName(map);
        getName(map);
    }
    private static void getKeyProdName (Map<Integer, Product> map) {
        for (Map.Entry<Integer, Product> prod : map.entrySet()) {
            System.out.printf("Ключ: %d Продукт: %s \n", prod.getKey(), prod.getValue().getProdName());
        }
    }
    private static void getProdName (Map<Integer, Product> map) {
        for(int key:map.keySet()){
            System.out.printf("Продукт: %s \n", map.get(key).getProdName());
        }
    }
    private static void getName (Map<Integer, Product> map) {
        for (Product p: map.values()){
            System.out.println(p.getProdName());
        }
    }
}