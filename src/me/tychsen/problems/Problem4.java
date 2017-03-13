package me.tychsen.problems;

public class Problem4 implements EulerProblem {
    @Override
    public String run() {
        int largestPalindrome = 0;
        for (int i = 999; i > 900; i--) {
            for (int j = 999; j > 900; j--) {
                int product = i * j;
                if (isPalindrome(i*j)) {
                    if (product > largestPalindrome) {
                        largestPalindrome = product;
                    }
                }
            }
        }

        return String.valueOf(largestPalindrome);
    }

    @Override
    public String getName() {
        return "Problem4";
    }

    private boolean isPalindrome(int number) {
        String numberAsString = Integer.toString(number);
        for (int j = 0; j < 3; j++) {
            int numberLength = numberAsString.length();
            if (numberAsString.charAt(j) != numberAsString.charAt(numberLength - j - 1)) {
                return false;
            }
        }

        return true;
    }
}
