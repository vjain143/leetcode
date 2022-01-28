import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RomantoIntegerTest {

    private RomantoInteger romantoInteger;

    @Before
    public void setUp() throws Exception {
        romantoInteger = new RomantoInteger();
    }

    @Test
    public void romanToInt4() {
        int actualResult = romantoInteger.romanToInt("IV");
        assertEquals(4, actualResult);
    }

    @Test
    public void romanToInt6() {
        int actualResult = romantoInteger.romanToInt("VI");
        assertEquals(6, actualResult);
    }

    @Test
    public void romanToInt8() {
        int actualResult = romantoInteger.romanToInt("VIII");
        assertEquals(8, actualResult);
    }

    @Test
    public void romanToInt9() {
        int actualResult = romantoInteger.romanToInt("IX");
        assertEquals(9, actualResult);
    }

    @Test
    public void romanToInt13() {
        int actualResult = romantoInteger.romanToInt("XIII");
        assertEquals(13, actualResult);
    }

    @Test
    public void romanToInt15() {
        int actualResult = romantoInteger.romanToInt("XV");
        assertEquals(15, actualResult);
    }

    @Test
    public void romanToInt40() {
        int actualResult = romantoInteger.romanToInt("XL");
        assertEquals(40, actualResult);
    }

    @Test
    public void romanToInt58() {
        int actualResult = romantoInteger.romanToInt("LVIII");
        assertEquals(58, actualResult);
    }

    @Test
    public void romanToInt767() {
        int actualResult = romantoInteger.romanToInt("DCCLXVII");
        assertEquals(767, actualResult);
    }

    @Test
    public void romanToInt900() {
        int actualResult = romantoInteger.romanToInt("CM");
        assertEquals(900, actualResult);
    }

    @Test
    public void romanToInt1900() {
        int actualResult = romantoInteger.romanToInt("MCM");
        assertEquals(1900, actualResult);
    }

    @Test
    public void romanToInt1994() {
        int actualResult = romantoInteger.romanToInt("MCMXCIV");
        assertEquals(1994, actualResult);
    }



}