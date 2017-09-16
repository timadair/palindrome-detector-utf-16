package com.example.palindrome;

/**
 * Created by timadair on 9/16/2017.
 */
public class PalindromeDetector {
  public static boolean isPalindrome(String candidate) {
    if (candidate == null || candidate.length() == 0) {
      return false;
    }
    String casedCandidate = candidate.toLowerCase();
    int frontIndex = 0;
    int backIndex = casedCandidate.length() - 1;
    return casedCandidate.charAt(frontIndex) == casedCandidate.charAt(backIndex);
  }
}
