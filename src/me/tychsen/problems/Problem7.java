package me.tychsen.problems;

public class Problem7 implements EulerProblem {
    @Override
    public String run() {
        int currentNumber = 2;
        int primeCount = 1;

        while (primeCount < 10001) {
            currentNumber++;
            if (isPrime(currentNumber)) {
                primeCount++;
            }
        }
        return String.valueOf(currentNumber);
    }

    @Override
    public String getName() {
        return "Problem7";
    }

    private boolean isPrime(int number) {
        if (number > 2 && number % 2 == 0) {
            return false;
        }
        for (int i = 3; i < number; i = i + 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
