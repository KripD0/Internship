package org.example.old;

import org.example.old.UniqueSimbol;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;


class UniqueSimbolTest {

    @Test
    void checkCharArray() {
        String firstLine = "aabbccaebcdabdc";
        String secondLine = "aabbcc";

        Character firstExpected = 'e';
        Character secondExpected = null;

        assertEquals(firstExpected, UniqueSimbol.checkCharArray(firstLine));
        assertEquals(secondExpected, UniqueSimbol.checkCharArray(secondLine));
    }
}