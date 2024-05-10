package org.example;

import java.util.Arrays;

public class CalculateMean {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        double average = Arrays.stream(numbers)
                .average()
                .orElse(Double.NaN);

        System.out.println("The average is: " + average);
    }
}

