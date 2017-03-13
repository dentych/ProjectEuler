package me.tychsen.problems;

public class Problem6 implements EulerProblem {
    private static final int AMOUNT_NUM = 100;

    @Override
    public String run() {
        double sumOfSquares = findSumOfSquares(AMOUNT_NUM);
        double squareOfSum = findSquareOfSum(AMOUNT_NUM);

        return String.valueOf(squareOfSum - sumOfSquares);
    }

    @Override
    public String getName() {
        return "Problem6";
    }

    private double findSumOfSquares(int number) {
        long sum = 1;
        for (int i = 2; i <= 100; i++) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    private double findSquareOfSum(int number) {
        long sum = 1;
        for (int i = 2; i <= 100; i++) {
            sum += i;
        }
        return Math.pow(sum, 2);
    }
}
