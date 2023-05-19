package org.example.old;
import org.example.old.BinarySearch;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearchTest {

    @Test
    public void binarySearch(){
        int[] array = new int[]{1, 43, 56, 23, 11, 17, 24, 9, 8, 13, 112, 16, 37};
        Arrays.sort(array);
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = new ArrayList<>();
        expected.add(1);
        expected.add(12);
        expected.add(-1);
        expected.add(7);
        actual.add(BinarySearch.binarySearch(array, 8));
        actual.add(BinarySearch.binarySearch(array, 112));
        actual.add(BinarySearch.binarySearch(array, 2));
        actual.add(BinarySearch.binarySearch(array, 23));
        Assert.assertEquals(expected, actual);
    }

}
