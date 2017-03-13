package me.tychsen.util;

public class PrimeCalculator {
    private long currentPrime = 1;

    public long nextPrime() {
        if (currentPrime <= 2) {
            currentPrime++;
        } else {
            do {
                currentPrime += 2;
            } while (!isPrime(currentPrime));
        }

        return currentPrime;
    }

    public boolean isPrime(long number) {
        if (number <= 1) {
            return false;
        } else if (number <= 3) {
            return true;
        } else if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        long i = 5;
        while (number/2 >= i) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }
        return true;
    }
}
