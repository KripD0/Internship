package org.example;

import java.util.HashMap;
import java.util.Map;

public class OutAllDuplicates {

    public static void main(String[] args) {
        initialize();
    }


    public static void initialize() {
        Map<String, String> map = new HashMap<>();
        map.put("a", "aa");
        map.put("c", "aa");
        map.put("d", "aa");
        map.put("b", "bbb");
        System.out.println(checkDuplicates(map));
    }


    //Почитал про map.merge не понял как его тут использовать, поэтому сделал так.
    public static Map<String, Integer> checkDuplicates(Map<String, String> map) {
        Map<String, Integer> duplicates = new HashMap<>();

        //Добавляем в новую мапу ключ-значение из предыдущей, а value - количество повторений.
        int count = 1;
        for (String value : map.values()) {
            if (!duplicates.containsKey(value)) {
                duplicates.put(value, count);
            } else {
                duplicates.put(value, duplicates.get(value) + 1);
            }
        }
        Map<String, Integer> deleteNotDuplicates = new HashMap<>();

        //Добавляем элементы которые нужно удалить в новую мапу.
        for (String value : duplicates.keySet()) {
            if (duplicates.get(value) == 1) {
                deleteNotDuplicates.put(value, duplicates.get(value));
            }
        }
        //Удаляем элементы которые не повторяются.
        for (String value : deleteNotDuplicates.keySet()) {
            if (duplicates.get(value) == 1) {
                duplicates.remove(value);
            }
        }

        return duplicates;
    }
}
