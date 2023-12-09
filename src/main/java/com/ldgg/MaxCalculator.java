package com.ldgg;

import java.util.Arrays;

public class MaxCalculator {

    public int findMax(int... numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Input array is empty or null");
        }
        return Arrays.stream(numbers).max().getAsInt();
    }
}
