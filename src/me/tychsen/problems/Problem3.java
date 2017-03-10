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
        Stack<BigInteger> primeFactors= new Stack<>();
        BigInteger divider = new BigInteger("2");
        BigInteger number = new BigInteger("600851475143");

        while (divider.compareTo(number.divide(new BigInteger("2"))) < 0) {
            if (number.mod(divider).equals(BigInteger.ZERO)) {
                primeFactors.add(divider);
            }
            divider = divider.add(new BigInteger("1"));
            System.out.println("Current value: " + divider.doubleValue());
        }
        return primeFactors.pop().intValue();
    }
}
