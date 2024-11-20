package Nov.exe_04112024CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class Lab193 {
    public static void main(String[] args) {
        Map<String, Integer>map = new HashMap();
        map.put("id1",1);
        map.put("id2",2);
        map.put("id3",3);
        map.put("id4",4);
        map.put("id5",null); // null value is allowed number of times
        map.put(null,100); // null key is allowed only once.
        System.out.println(map);
        System.out.println(map.isEmpty());
        System.out.println(map.get("id3"));
        System.out.println(map.size());
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.containsKey("id5"));
        System.out.println(map.containsValue(45));


        // To iterate the elements using for each loop or entryset

        for(Map.Entry<String, Integer>item : map.entrySet()){
            System.out.println(item.getKey()+"->"+item.getValue());
        }

    }
}
