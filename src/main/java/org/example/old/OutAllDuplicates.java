package org.example.old;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OutAllDuplicates {

    public static void main(String[] args) {
        initialize();
    }

    public static void initialize() {
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("aa");
        list.add("aa");
        list.add("bbb");
        checkDuplicates(list);
    }

    public static Map<String, Integer> checkDuplicates(List<String> list) {
        Map<String, Integer> countMap = new HashMap<>();
        for (String str : list) {
            countMap.merge(str, 1, Integer::sum);
        }

        for (Map.Entry<String, Integer> current : countMap.entrySet()) {
            if (current.getValue() > 1) {
                System.out.println(current.getKey() + " - " + current.getValue());
            }
        }
        countMap.entrySet().removeIf(current -> current.getValue() == 1);
        return countMap;
    }
}
