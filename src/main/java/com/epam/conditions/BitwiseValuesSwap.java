package com.epam.conditions;

public class BitwiseValuesSwap {

    public void swap(int first, int second) {

        System.out.printf("Before swap:first=%d, second=%d\n", first, second);

        first ^= second;
        second ^= first;
        first ^= second;

        System.out.printf("After swap:first=%d, second=%d\n", first, second);

    }

}
