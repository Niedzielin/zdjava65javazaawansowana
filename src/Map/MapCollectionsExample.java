package Map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Hyperbook on 10/11/2020
 **/
public class MapCollectionsExample {
    public static void main(String[] args) {
        Map<Integer, String> mapIdToNameCar = new HashMap<>();
        mapIdToNameCar.put(1,"name");
        mapIdToNameCar.put(2,"name2");

        String nameCar2 = mapIdToNameCar.get(2);
        System.out.println(nameCar2);
        mapIdToNameCar.put(2,"nowaWartosc");
        nameCar2 = mapIdToNameCar.get(2);
        System.out.println(nameCar2);

        mapIdToNameCar.keySet().forEach(System.out::println);
    }
}
