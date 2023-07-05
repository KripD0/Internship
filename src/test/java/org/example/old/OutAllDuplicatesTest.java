package org.example.old;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OutAllDuplicatesTest {

    public final static Map<String, String> firstMap = new HashMap<>();
    public final static Map<String, String> secondMap = new HashMap<>();

    static {
        firstMap.put("a", "aa");
        firstMap.put("b", "aa");
        firstMap.put("c", "cc");
        firstMap.put("d", "cc");
        firstMap.put("f", "ee");
        firstMap.put("e", "ff");

        secondMap.put("1", "12");
        secondMap.put("2", "13");
        secondMap.put("3", "14");
        secondMap.put("4", "15");
        secondMap.put("5", "16");
        secondMap.put("6", "17");
        secondMap.put("7", "19");
    }

    @Test
    void checkDuplicates() {
        Map<String, Integer> firstExpected = new HashMap<>();
        firstExpected.put("aa", 2);
        firstExpected.put("cc", 2);

        Map<String, Integer> secondExpected = new HashMap<>();

        assertEquals(firstExpected, OutAllDuplicates.checkDuplicates(firstMap));
        assertEquals(secondExpected, OutAllDuplicates.checkDuplicates(secondMap));

    }
}