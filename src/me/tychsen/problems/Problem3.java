package me.tychsen.problems;

import java.math.BigInteger;
import java.util.Stack;

/**
 * Euler prime factor of 600851475143.
 * https://projecteuler.net/problem=3
 */
public class Problem3 implements EulerProblem {
    @Override
    public int run() {
        BigInteger divider = new BigInteger("2");
        BigInteger number = new BigInteger("600851475143");


        while (divider.compareTo(number.divide(new BigInteger("2"))) < 0) {
            if (number.mod(divider).equals(BigInteger.ZERO)) {
                number = number.divide(divider);
                if (isPrime(number)) {
                    return number.intValue();
                }
            }
            divider = divider.add(new BigInteger("1"));
        }

        return -1;
    }

    private boolean isPrime(BigInteger number) {
        double numberAsInt = number.doubleValue();
        for (double i = 2; i < numberAsInt; i++) {
            if (numberAsInt % i == 0) {
                return false;
            }
        }

        return true;
    }
}
