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

  @Test
  public void shouldHandleOtherSingleCharacter() {
    assertTrue(isPalindrome("b"));
  }

  @Test
  public void shouldRejectNull() {
    assertFalse(isPalindrome(null));
  }

  @Test
  public void shouldRejectEmptyString() {
    assertFalse(isPalindrome(""));
  }

  @Test
  public void shouldAcceptRepeatedCharacter() {
    assertTrue(isPalindrome("mm"));
  }

  @Test
  public void shouldRejectDifferentCharacters() {
    assertFalse(isPalindrome("mk"));
  }

  @Test
  public void shouldBeCaseInsensitive() {
    assertTrue(isPalindrome("mM"));
  }

  @Test
  public void shouldApproveMom() {
    assertTrue(isPalindrome("Mom"));
  }

  @Test
  public void shouldRejectMok() {
    assertFalse(isPalindrome("mop"));
  }
}
