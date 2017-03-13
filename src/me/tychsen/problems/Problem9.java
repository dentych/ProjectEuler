package me.tychsen.problems;

public class Problem9 implements EulerProblem {
    @Override
    public String run() {

        for (int a = 0; a < 300; a++) {
            for (int b = 0; b < 400; b++) {
                for (int c = 0; c < 500; c++) {
                    int ab = a * a + b * b;
                    if ((ab == c * c) && (a + b + c == 1000) && a != 0 && b != 0 && c != 0 && a < b && b < c) {
                        return String.valueOf(a * b * c);
                    }
                }
            }
        }

        return "No solution found";
    }

    @Override
    public String getName() {
        return "Problem9";
    }
}
