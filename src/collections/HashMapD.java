package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapD {
    static Map<Integer,String> map=new HashMap<>();

    public static void main(String[] args) {
        map.put(1,"kumar");
        map.put(2,"swamy");
        for(int i: map.keySet()){
            System.out.println(map.get(i));
        }
        for(Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

    }
}
