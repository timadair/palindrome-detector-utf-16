package com.example.palindrome;

import static java.lang.Character.isHighSurrogate;
import static java.lang.Character.isLowSurrogate;

/**
 * Created by timadair on 9/16/2017.
 */
public class PalindromeDetector {

  public static boolean isPalindrome(String candidate) {
    if (candidate == null || candidate.length() == 0) {
      return false;
    }
    String casedCandidate = candidate.toLowerCase().replaceAll("[\\s\\p{Punct}]", "");
    int frontIndex = 0;
    int backIndex = casedCandidate.length() - 1;
    boolean match = true;
    while(match && frontIndex < backIndex) {
      if (casedCandidate.charAt(frontIndex) != casedCandidate.charAt(backIndex)) {
        if (isHighSurrogate(casedCandidate.charAt(frontIndex))) {
          if (casedCandidate.charAt(frontIndex) != casedCandidate.charAt(backIndex - 1)) {
            match = false;
          }
        }
        else if (isLowSurrogate(casedCandidate.charAt(frontIndex))) {
          if (casedCandidate.charAt(frontIndex) != casedCandidate.charAt(backIndex + 1)) {
            match = false;
          }
        }
        else {
          match = false;
        }
      }
      frontIndex++;
      backIndex--;
    }

    return match;
  }
}
