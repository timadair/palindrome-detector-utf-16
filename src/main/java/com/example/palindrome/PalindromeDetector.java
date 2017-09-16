package com.example.palindrome;

/**
 * Created by timadair on 9/16/2017.
 */
public class PalindromeDetector {
  public static boolean isPalindrome(String candidate) {
    if (candidate == null) {
      return false;
    }
    return candidate.length() == 1;
  }
}
