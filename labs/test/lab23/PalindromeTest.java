package lab23;

import org.junit.Test;

import static lab23.Palindrome.isPalindrome;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class PalindromeTest {
    @Test
    public void testIsPalindrome() {
        assertTrue(isPalindrome("шабаш"));
        assertTrue(isPalindrome("12321"));
        assertTrue(isPalindrome(" "));
        assertTrue(isPalindrome("a!!a"));
        assertTrue (isPalindrome("aaa bb bb aaa"));

        assertFalse(isPalindrome("Шабаш"));
        assertFalse(isPalindrome(" a"));
        assertFalse(isPalindrome("a "));
        assertFalse(isPalindrome("abc"));
        assertFalse(isPalindrome("123"));
        assertFalse(isPalindrome("aaa bb aa bb"));
    }
}