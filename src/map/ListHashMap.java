package map;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListHashMap {
    public static void main(String[] args) {
        List<String> statesOfUsa = new ArrayList<String>();
        statesOfUsa.add("NY");
        statesOfUsa.add("NJ");
        statesOfUsa.add("FL");
        statesOfUsa.add("AZ");
        statesOfUsa.add("VA");

        List<String> statesOfCanada = new ArrayList<String>();
        statesOfCanada.add("Toronto");
        statesOfCanada.add("Montreal");
        statesOfCanada.add("Alberta");
        statesOfCanada.add("Vancouver");

        List<String> statesOfBangladesh = new ArrayList<String>();
        statesOfBangladesh.add("Dhaka");
        statesOfBangladesh.add("Comilla");
        statesOfBangladesh.add("Chittagonj");
        statesOfBangladesh.add("Sylhet");
        statesOfBangladesh.add("Manikgonj");

        Map<String, List<String>> map = new HashMap<String, List<String>>();
        map.put("USA", statesOfUsa);
        map.put("Canada", statesOfCanada);
        map.put("Bangladesh", statesOfBangladesh);

        for(Map.Entry<String,List<String>> entry:map.entrySet()){
            System.out.println(entry.getKey()+ " "+ entry.getValue());
        }

    }
}
