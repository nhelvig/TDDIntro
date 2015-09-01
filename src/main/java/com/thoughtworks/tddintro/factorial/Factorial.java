package com.thoughtworks.tddintro.factorial;

public class Factorial {
    public Integer compute(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i == 0) {
            return 1;
        }
        return i * compute(i - 1);
    }
}
