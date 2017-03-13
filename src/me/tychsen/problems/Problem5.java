package me.tychsen.problems;

public class Problem5 implements EulerProblem {
    @Override
    public String run() {
        for (int i = 2; i < Integer.MAX_VALUE; i++) {
            if (isDividable(i)) {
                return String.valueOf(i);
            }
        }
        return "No solution found.";
    }

    @Override
    public String getName() {
        return "Problem5";
    }

    private boolean isDividable(int number) {
        for (int i = 2; i <= 20; i++) {
            if (number % i != 0) {
                return false;
            }
        }
        return true;
    }
}
