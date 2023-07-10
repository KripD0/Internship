package org.example.old;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


class UniqueSimbolTest {

    @Test
    void checkCharArray() {
        String firstLine = "aabbccaebcdabdc";
        String secondLine = "aabbcc";

        Character firstExpected = 'e';

        assertEquals(firstExpected, UniqueSimbol.checkCharArray(firstLine));
        assertNull(UniqueSimbol.checkCharArray(secondLine));
    }
}