package Multithreading.rehashing_infiniteloop;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cbokeloh on 29.01.16.
 */
public class Rehashing_InfiniteLoop {
    public static void main(String[] args) {
        HashMap map = new HashMap<String, String>();
        map.put("1", "Eins");
        map.put("2", "Zwei");
        map.put("3", "Drei");
        map.put("3", "Drei");
        map.put("4", "vier");
        map.put("5", "fünf");
        map.put("6", "sechs");
        map.put("7", "sieben");
        map.put("8", "acht");
        map.put("9", "neun");
        map.put("10", "zehn");
        map.put("11", "elf");
        map.put("12", "zwölf");
        map.put("13", "Dreizehn");
        System.out.println(map);

    }
}
