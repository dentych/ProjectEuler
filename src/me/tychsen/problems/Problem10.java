package me.tychsen.problems;

import java.util.Arrays;

public class Problem10 implements EulerProblem {
    private static final int SIZE = 2000000;

    @Override
    public String run() {
        boolean array[] = new boolean[SIZE+1];
        long sum = 0;

        Arrays.fill(array, true);

        for (int i = 2; i < Math.sqrt(SIZE); i++) {
            if (array[i]) {
                for (int j = 0; ((i * i) + (i * j)) < SIZE; j++) {
                    int index = ((i * i) + (i * j));
                    array[index] = false;
                }
            }
        }

        for (int i = 2; i < SIZE; i++) {
            if (array[i]) {
                sum += i;
            }
        }

        return String.valueOf(sum);
    }

    @Override
    public String getName() {
        return "Problem10";
    }
}
