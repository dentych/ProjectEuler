package me.tychsen;

import me.tychsen.problems.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<EulerProblem> problems = new ArrayList<>();

    public static void main(String... args) {
        problems.add(new Problem2());
        problems.add(new Problem3());
        problems.add(new Problem4());
        problems.add(new Problem5());
        problems.add(new Problem6());
        problems.add(new Problem7());
        problems.add(new Problem8());
        problems.add(new Problem9());

        execute();
    }

    private static void execute() {
        for (EulerProblem problem : problems) {
            System.out.println("Calculating: " + problem.getName());
            long start = System.currentTimeMillis();
            String solution = problem.run();
            long end = System.currentTimeMillis();
            System.out.println("SOLUTION: " + solution);
            System.out.println("TIME: " + (end - start) + " ms");
            System.out.println();
        }
    }
}
