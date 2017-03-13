package me.tychsen.problems;

/**
 * Sum of even Fibonnaci numbers up to 4000000.
 * https://projecteuler.net/problem=2
 */
public class Problem2 implements EulerProblem {
    @Override
    public String run() {
        int previous = 1;
        int current = 2;
        int sum = 0;

        while (current <= 4000000) {
            if (current % 2 == 0) {
                sum += current;
            }
            int newCurrent = previous + current;
            previous = current;
            current = newCurrent;
        }

        return String.valueOf(sum);
    }

    @Override
    public String getName() {
        return "Problem2";
    }
}
