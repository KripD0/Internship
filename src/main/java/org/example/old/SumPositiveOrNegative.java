package org.example.old;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumPositiveOrNegative {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(11, 1, 2, 3, -9, 10, 4, -8, -6, 6, -7));
        positiveSum(list);
        negativeSum(list);
    }

    public static int positiveSum(List<Integer> list) {
        int result = list.stream()
                .filter(current -> current > 0)
                .reduce(Integer::sum).orElse(0);
        System.out.println(result);
        return result;
    }

    public static int negativeSum(List<Integer> list) {
        int result = list.stream()
                .filter(current -> current < 0)
                .reduce(Integer::sum).orElse(0);
        System.out.println(result);
        return result;
    }
}
