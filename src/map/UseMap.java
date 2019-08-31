package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class UseMap {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("USA", "NY");
        map.put("Canada", "Toronto");
        map.put("Bangladesh", "Dhaka");
        map.put("Japan", "Tokyo");

        for(Map.Entry<String, String> entry:map.entrySet()) {
            System.out.println(entry.getKey()+ " : "+ entry.getValue());
        }
    }
}
