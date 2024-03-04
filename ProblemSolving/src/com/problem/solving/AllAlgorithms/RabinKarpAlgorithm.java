package com.problem.solving.AllAlgorithms;
/*
 * 
 * Best Algorithm for searching Strings
 * The Rabin-Karp algorithm is a string matching algorithm used to find all occurrences of
 * a short pattern string within a longer text string
 * 
 */
public class RabinKarpAlgorithm {
	public static void search(String text, String pattern) {
        int textLength = text.length();
        int patternLength = pattern.length();
        int prime = 101; // A prime number used for the hash function
        int charSetSize = 256; // Assuming ASCII character set

        int patternHash = 0; // Hash value for the pattern
        int windowHash = 0; // Hash value for the current window

        // Calculate the initial hash values for the pattern and the first window
        for (int i = 0; i < patternLength; i++) {
            patternHash = (charSetSize * patternHash + pattern.charAt(i)) % prime;
            windowHash = (charSetSize * windowHash + text.charAt(i)) % prime;
        }

        for (int i = 0; i <= textLength - patternLength; i++) {
            if (patternHash == windowHash) {
                // Check character by character to confirm the match
                boolean match = true;
                for (int j = 0; j < patternLength; j++) {
                    if (text.charAt(i + j) != pattern.charAt(j)) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    System.out.println("Pattern found at index " + i);
                }
            }

            // Update the hash value for the next window
            if (i < textLength - patternLength) {
                windowHash = (charSetSize * (windowHash - text.charAt(i) * (int) Math.pow(charSetSize, patternLength - 1)) + text.charAt(i + patternLength)) % prime;

                // Ensure the hash value is positive
                if (windowHash < 0) {
                    windowHash = (windowHash + prime);
                }
            }
        }
    }

    public static void main(String[] args) {
        String text = "ABABDABACDABABCABAB";
        String pattern = "ABAB";

        search(text, pattern);
    }

}
