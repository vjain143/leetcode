import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeNumberTest {

    private PalindromeNumber palindromeNumber;

    @Before
    public void setUp() throws Exception {
        palindromeNumber = new PalindromeNumber();
    }

    @Test
    public void isPalindrome1221() {
        boolean actualResult = palindromeNumber.isPalindrome(1221);
        assertEquals(true, actualResult);
    }

    @Test
    public void isPalindrome1213() {
        boolean actualResult = palindromeNumber.isPalindrome(1213);
        assertEquals(true, actualResult);
    }

    @Test
    public void isPalindromeNegative1221() {
        boolean actualResult = palindromeNumber.isPalindrome(-1221);
        assertEquals(true, actualResult);
    }
}