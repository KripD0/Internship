package org.example.old;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OutAllDuplicatesTest {

    public final static List<String> firstList = new ArrayList<>();
    public final static List<String> secondList = new ArrayList<>();

    static {
        firstList.add("aa");
        firstList.add("aa");
        firstList.add("cc");
        firstList.add("cc");
        firstList.add("ee");
        firstList.add("ff");

        secondList.add("12");
        secondList.add("13");
        secondList.add("14");
        secondList.add("15");
        secondList.add("16");
        secondList.add("17");
        secondList.add("19");
    }

    @Test
    void checkDuplicates() {
        Map<String, Integer> firstExpected = new HashMap<>();
        firstExpected.put("aa", 2);
        firstExpected.put("cc", 2);

        Map<String, Integer> secondExpected = new HashMap<>();

        assertEquals(firstExpected, OutAllDuplicates.checkDuplicates(firstList));
        assertEquals(secondExpected, OutAllDuplicates.checkDuplicates(secondList));

    }
}