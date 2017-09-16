package com.example.palindrome;

/**
 * Created by timadair on 9/16/2017.
 */
public class PalindromeDetector {
  public static boolean isPalindrome(String candidate) {
    if (candidate == null || candidate.length() == 0) {
      return false;
    }
    int frontIndex = 0;
    int backIndex = candidate.length() - 1;
    return candidate.charAt(frontIndex) == candidate.charAt(backIndex);
  }
}
