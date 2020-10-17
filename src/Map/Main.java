package Map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Hyperbook on 10/11/2020
 **/
public class Main {
    public static void main(String[] args) {
        Map<Long, String> mapIdToName = new HashMap<>();
        mapIdToName.put(1L,"Adam");
        mapIdToName.put(2L,"Aleksander");
        mapIdToName.put(3L,"Arkadiusz");
        mapIdToName.put(4L,"Amadeusz");
        mapIdToName.put(5L,"Jan");
        mapIdToName.put(6L,"Jan");
        mapIdToName.put(7L,"Paweł");
        mapIdToName.put(8L,"Jan");

        for (int i = 1; i <= mapIdToName.size(); i++) {
            long l= (long) i;
            String name = mapIdToName.get(l);
            if (mapIdToName.get(l).toLowerCase().startsWith("a")){
                System.out.println(name);
            }
        }
        for (int i = 1; i <= mapIdToName.size(); i++) {
            if (mapIdToName.get((long)i).toLowerCase().equals("jan")){
                System.out.println("Id pasujące do Jana to "+i);
            }
        }
    }
}
