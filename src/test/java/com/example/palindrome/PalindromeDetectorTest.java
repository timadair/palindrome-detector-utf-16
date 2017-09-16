package com.example.palindrome;

import org.testng.annotations.Test;

import static com.example.palindrome.PalindromeDetector.isPalindrome;
import static org.junit.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

/**
 * Created by timadair on 9/16/2017.
 */
public class PalindromeDetectorTest {
  @Test
  public void shouldHandleSingleCharacters() {
    assertTrue(isPalindrome("a"));
  }
}
