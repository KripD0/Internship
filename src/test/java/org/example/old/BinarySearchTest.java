package org.example.old;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearchTest {

    @Test
    public void binarySearch() {
        long[] array = new long[]{3_520_030_000L, 43, 56, 23, 11, 17, 24, 9, 8, 13, 112, 16, 37};
        Arrays.sort(array);
        List<Long> expected = new ArrayList<>();
        List<Long> actual = new ArrayList<>();
        expected.add(12L);
        expected.add(11L);
        expected.add(-1L);
        expected.add(6L);
        actual.add((long) BinarySearch.binarySearch(array, 3_520_030_000L));
        actual.add((long) BinarySearch.binarySearch(array, 112L));
        actual.add((long) BinarySearch.binarySearch(array, 2L));
        actual.add((long) BinarySearch.binarySearch(array, 23L));
        Assert.assertEquals(expected, actual);
    }

}
