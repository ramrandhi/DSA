package com.specific;

public class CalculatePossibleCombinations {
	public static long calculatePossibleCombinations(String inputStr) {
        if (inputStr == null || inputStr.isEmpty()) {
            return 0;
        }
 
        int n = inputStr.length();
        long[] dp = new long[n+1];
 
        // Base cases
        dp[0] = 1; // An empty string has one way to decode (the empty decoding)
        dp[1] = (inputStr.charAt(0) != '0') ? 1 : 0; // First character can't be 0
 
        for (int i = 2; i <= n; i++) {
            // Single digit decoding (must be between 1 and 9)
            int oneDigit = Integer.parseInt(inputStr.substring(i - 1, i));
            if (oneDigit >= 1 && oneDigit <= 9) {
                dp[i] = dp[i] + dp[i - 1];
            }
 
            // Two digit decoding (must be between 10 and 26)
            int twoDigits = Integer.parseInt(inputStr.substring(i - 2, i));
            if (twoDigits >= 10 && twoDigits <= 26) {
                dp[i] = dp[i] + dp[i - 2];
            }
        }
 
        return dp[n]; // Final result: Total ways to decode the entire string
    }
 
    public static void main(String[] args) {
        String input = "019205";
        System.out.println("Possible combinations: " + calculatePossibleCombinations(input));
    }
}
