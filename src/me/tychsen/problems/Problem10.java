package me.tychsen.problems;

import me.tychsen.util.PrimeCalculator;

public class Problem10 implements EulerProblem {
    private PrimeCalculator primeCalculator = new PrimeCalculator();

    @Override
    public String run() {
        long sum = 0;

        long prime = 0;
        do {
            sum += prime;
            if (prime % 100000 < 10) {
                System.out.println("Current prime: " + prime);
            }
            prime = primeCalculator.nextPrime();
        } while (prime < 2000000);

        return String.valueOf(prime);
    }

    @Override
    public String getName() {
        return "Problem10";
    }
}
