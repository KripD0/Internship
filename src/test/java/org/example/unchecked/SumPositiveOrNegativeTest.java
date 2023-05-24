package org.example.unchecked;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SumPositiveOrNegativeTest {

    public static final List<Integer> FIRST_DATA_LIST = new ArrayList<>(Arrays.asList(11, 1, 2, 3, -9, 10, 4, -8, -6, 6, -7));
    public static final List<Integer> SECOND_DATA_LIST = new ArrayList<>(Arrays.asList(13, -10, 4, 3, -2, 1, 17, -8, -6, 6, -14));

    @Test
    void positiveSum() {

        int firstExpectedValue = 37;
        int secondExpectedValue = 44;

        assertEquals(firstExpectedValue, SumPositiveOrNegative.positiveSum(FIRST_DATA_LIST));
        assertEquals(secondExpectedValue, SumPositiveOrNegative.positiveSum(SECOND_DATA_LIST));
    }

    @Test
    void negativeSum() {

        int firstExpectedValue = -30;
        int secondExpectedValue = -40;

        assertEquals(firstExpectedValue, SumPositiveOrNegative.negativeSum(FIRST_DATA_LIST));
        assertEquals(secondExpectedValue, SumPositiveOrNegative.negativeSum(SECOND_DATA_LIST));
    }
}