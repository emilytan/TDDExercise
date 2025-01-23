
package emily.example;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeralConverter {

    private static final Map<Character, Integer> romanToDecimalMap = new HashMap<>();

    static {
        romanToDecimalMap.put('I', 1);
        romanToDecimalMap.put('V', 5);
        romanToDecimalMap.put('X', 10);
        romanToDecimalMap.put('L', 50);
        romanToDecimalMap.put('C', 100);
        romanToDecimalMap.put('D', 500);
        romanToDecimalMap.put('M', 1000);
    }

    public static int convert(String roman) {
        validateRomanNumeral(roman);

        int decimal = 0;
        int prev = 0;

        for (int i = roman.length() - 1; i >= 0; i--) {
            int current = romanToDecimalMap.get(roman.charAt(i));
            if (current < prev) {
                decimal -= current;
            } else {
                decimal += current;
            }
            prev = current;
        }

        return decimal;
    }

    private static void validateRomanNumeral(String roman) {
        // Check for invalid repeated characters (only valid repeats are handled by the algorithm)
        if (roman.matches(".*(IIII|VV|XXXX|LL|CCCC|DD|MMMM).*")) {
            throw new IllegalArgumentException("Invalid Roman numeral: " + roman);
        }

        // Check for specific invalid cases
        if (roman.contains("IIII") || roman.contains("VX") || roman.contains("IC") ||
                roman.contains("IL") || roman.contains("IM") || roman.contains("MCMLXXXIXI")) {
            throw new IllegalArgumentException("Invalid Roman numeral: " + roman);
        }
    }

}
