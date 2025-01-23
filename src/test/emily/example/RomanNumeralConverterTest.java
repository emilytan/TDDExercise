package emily.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class RomanNumeralConverterTest {

    private final RomanNumeralConverter converter = new RomanNumeralConverter();

    @Test
    public void testRomanNumerals() {
        assertEquals(1, converter.convert("I"));
        assertEquals(2, converter.convert("II"));
        assertEquals(3, converter.convert("III"));
        assertEquals(4, converter.convert("IV"));
        assertEquals(5, converter.convert("V"));
        assertEquals(6, converter.convert("VI"));
        assertEquals(7, converter.convert("VII"));
        assertEquals(8, converter.convert("VIII"));
        assertEquals(9, converter.convert("IX"));
        assertEquals(10, converter.convert("X"));
        assertEquals(20, converter.convert("XX"));
        assertEquals(30, converter.convert("XXX"));
        assertEquals(40, converter.convert("XL"));
        assertEquals(50, converter.convert("L"));
        assertEquals(90, converter.convert("XC"));
        assertEquals(100, converter.convert("C"));
        assertEquals(400, converter.convert("CD"));
        assertEquals(500, converter.convert("D"));
        assertEquals(501, converter.convert("DI"));
        assertEquals(900, converter.convert("CM"));
        assertEquals(1000, converter.convert("M"));
        assertEquals(1989, converter.convert("MCMLXXXIX"));
    }

    @Test
    public void testInvalidRomanNumerals() {
        assertThrows(IllegalArgumentException.class, () -> converter.convert("IIII"));
        assertThrows(IllegalArgumentException.class, () -> converter.convert("VX"));
        assertThrows(IllegalArgumentException.class, () -> converter.convert("IC"));
        assertThrows(IllegalArgumentException.class, () -> converter.convert("IL"));
        assertThrows(IllegalArgumentException.class, () -> converter.convert("IM"));
        assertThrows(IllegalArgumentException.class, () -> converter.convert("MCMLXXXIXI"));
    }
}
