package interview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @Author: respass
 * @Date: 2018
 */
public class TravelMap {
    public static void main(String[] args) {
        Map map = new HashMap();

        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            Object value = map.get(key);
        }


        Iterator iterator1 = map.entrySet().iterator();
        while (iterator1.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
        }
    }
}
