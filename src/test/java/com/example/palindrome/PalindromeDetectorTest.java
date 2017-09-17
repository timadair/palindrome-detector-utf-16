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
  public void shouldApproveSingleCharacter() {
    assertTrue(isPalindrome("a"));
  }

  @Test
  public void shouldApproveOtherSingleCharacter() {
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
  public void shouldApproveRepeatedCharacter() {
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

  @Test
  public void shouldRejectBulb() {
    assertFalse(isPalindrome("bulb"));
  }

  @Test
  public void shouldRejectTort() {
    assertFalse(isPalindrome("tort"));
  }

  @Test
  public void shouldApproveDood() {
    assertTrue(isPalindrome("dood"));
  }

  @Test
  public void shouldIgnoreSpaces() {
    assertTrue(isPalindrome("Euston saw I was not Sue"));
  }

  @Test
  public void shouldIgnoreWhiteSpace() {
    assertTrue(isPalindrome("Euston saw\tI\nwas\n\rnot Sue"));
  }
}
