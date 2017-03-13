package me.tychsen;

import me.tychsen.problems.Problem3;

public class Main {
    public static void main(String... args) {
        Problem3 problem = new Problem3();
        long start = System.currentTimeMillis();
        System.out.println("SOLUTION: " + problem.run());
        long end = System.currentTimeMillis();

        System.out.println("Time: " + (end-start));
    }
}
