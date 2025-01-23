package emily.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PrimeFactorsTest {

    @Test
    public void testprimeFactorWith3() {
        List<Integer> expected = List.of(3);
        List<Integer> actual = PrimeFactors.primeFactor(3);
        assertEquals(expected, actual);
    }

    @Test
    public void testprimeFactorWith8() {
        List<Integer> expected = List.of(2, 2, 2);
        List<Integer> actual = PrimeFactors.primeFactor(8);
        assertEquals(expected, actual);
    }

    @Test
    public void testprimeFactorWith10() {
        List<Integer> expected = List.of(2, 5);
        List<Integer> actual = PrimeFactors.primeFactor(10);
        assertEquals(expected, actual);
    }

    @Test
    public void testprimeFactorWith1() {
        List<Integer> expected = List.of();
        List<Integer> actual = PrimeFactors.primeFactor(1);
        assertEquals(expected, actual);
    }


}
