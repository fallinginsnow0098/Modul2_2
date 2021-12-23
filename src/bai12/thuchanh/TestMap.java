package bai12.thuchanh;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Tien", 29);
        hashMap.put("Nam", 21);
        hashMap.put("Trung", 28);
        hashMap.put("Hung", 19);
        hashMap.put("Huan", 23);
        System.out.println("Display all name");
        System.out.println(hashMap + "\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display name in ascending order of key");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f, true);
        linkedHashMap.put("Mai", 30);
        linkedHashMap.put("Huyen", 22);
        linkedHashMap.put("Cuong", 23);
        linkedHashMap.put("Tu", 23);
        linkedHashMap.put("Tuyen", 19);
        System.out.println("\nThe age for" + " Huyen is "+ linkedHashMap.get("Huyen"));
        System.out.println("\nHashcode of Huyen is: " + linkedHashMap.hashCode());
    }
}
